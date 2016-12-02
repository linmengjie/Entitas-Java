package com.ilargia.games.entitas.codeGenerator;


import com.ilargia.games.entitas.codeGenerator.interfaces.*;
import com.ilargia.games.entitas.codeGenerator.intermediate.CodeGenFile;
import com.ilargia.games.entitas.codeGenerator.intermediate.ComponentInfo;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.JavaDocSource;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodeGenerator {

    public static final String COMPONENT_SUFFIX = "Component";
    public static final String DEFAULT_COMPONENT_LOOKUP_TAG = "ComponentIds";
    public static final String AUTO_GENERATED_HEADER_FORMAT = String.join("\n",
            "---------------------------------------------------------------------------",
            " '<auto-generated>'  This code was generated by CodeGeneratorApp.",
            "---------------------------------------------------------------------------"
    );

    public static String capitalize(final String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'') { // You can add other chars here
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    public static Map<String, List<ComponentInfo>> generateMap(List<ComponentInfo> componentInfos) {
        Map<String, List<ComponentInfo>> poolsComponents = new HashMap<>();

        for (ComponentInfo info : componentInfos) {
            for (String poolName : info.pools) {
                if (!poolsComponents.containsKey(poolName)) {
                    poolsComponents.put(poolName, new ArrayList<>());
                }
                List<ComponentInfo> list = poolsComponents.get(poolName);
                list.add(info);
            }
        }

        return poolsComponents;

    }



    public List<CodeGenFile> generate(ICodeGeneratorDataProvider provider, String destinyDirectory, List<ICodeGenerator> codeGenerators) {

        int index = destinyDirectory.lastIndexOf("main/java/");
        if(index==-1) {
            index = destinyDirectory.lastIndexOf("test/java/");
        }
        index+=10;

        String sourcePackage = destinyDirectory.substring(index).replaceAll("/",".");

        ArrayList<CodeGenFile> generatedFiles = new ArrayList<CodeGenFile>();
        List<ComponentInfo> componentInfos = provider.componentInfos();
        List<JavaClassSource> files = new ArrayList<>();


        for (ICodeGenerator generator : codeGenerators) {
            if (generator instanceof IPoolCodeGenerator) {
                files.addAll(((IPoolCodeGenerator) generator).generate(provider.poolNames(), sourcePackage));

            }

            if (generator instanceof IComponentCodeGenerator) {
                files.addAll(((IComponentCodeGenerator) generator).generate(componentInfos, sourcePackage));

            }

            if (generator instanceof IBlueprintsCodeGenerator) {
                files.addAll(((IBlueprintsCodeGenerator) generator).generate(provider.blueprintNames(), sourcePackage));

            }
            writeFiles(destinyDirectory, files);
        }
        return generatedFiles;

    }

    public void writeFiles(String directoryName, List<JavaClassSource> files) {

        File directory = new File(String.valueOf(directoryName));
        if (!directory.exists()) {
            directory.mkdir();
        }

        files.stream().forEach((file) -> {
            JavaDocSource javaDoc = file.getJavaDoc();
            javaDoc.setFullText(String.format(AUTO_GENERATED_HEADER_FORMAT, "CodeGenerator"));

            String fileName = directory.getPath() + "/" + file.getName() + ".java";
            write(fileName, file.toString());

        });

    }

    public void write(String fileName, String content) {
        System.out.println(content);
        File file = new File(fileName);
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}


