package com.ilargia.games.logicbrick.component;

import com.badlogic.gdx.math.Vector2;
import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.entitas.Component;

@Component(pools = {"Core"})
public class Motion implements IComponent {
    public Vector2 velocity;

    public Motion(float x, float y) {
        this.velocity = new Vector2(x, y);
    }


}
