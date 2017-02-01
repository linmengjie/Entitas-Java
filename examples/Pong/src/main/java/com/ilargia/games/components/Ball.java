package com.ilargia.games.components;

import com.ilargia.games.entitas.codeGenerator.Component;
import com.ilargia.games.entitas.api.IComponent;

@Component(pools = {"Core"}, isSingleEntity = true)
public class Ball implements IComponent {
    public boolean resetBall;


}