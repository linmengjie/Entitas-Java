package com.ilargia.games.entitas.codeGenerator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Component {

    String[] pools() default {"SplashPool"};

    boolean isSingleEntity() default false;

    String customPrefix() default "";

    String[] customComponentName() default {""};

}