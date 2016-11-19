package com.ilargia.games.entitas.generated;

import com.ilargia.games.entitas.PoolMetaData;
import com.ilargia.games.entitas.interfaces.IComponent;
import java.util.Stack;
import com.ilargia.games.entitas.components.Movable;
import com.ilargia.games.entitas.components.Views;
import com.ilargia.games.entitas.components.Position;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp. Changes to
 * this file may cause incorrect behavior and will be lost.
 * 
 * ---------------------------------------------------------------------------
 */
public class Entity extends com.ilargia.games.entitas.Entity {

	public Views viewsComponent = new Views();

	public Entity(int totalComponents, Stack<IComponent>[] componentPools,
			PoolMetaData poolMetaData) {
		super(totalComponents, componentPools, poolMetaData);
	}

	public Movable getMovable() {
		return (Movable) getComponent(CoreComponentIds.Movable);
	}

	public boolean hasMovable() {
		return hasComponent(CoreComponentIds.Movable);
	}

	public void addMovable(boolean _isMovable) {
		Movable component = createComponent(CoreComponentIds.Movable,
				Movable.class);
		component.isMovable = _isMovable;
		addComponent(CoreComponentIds.Movable, component);
	}

	public void replaceMovable(boolean _isMovable) {
		Movable component = createComponent(CoreComponentIds.Movable,
				Movable.class);
		component.isMovable = _isMovable;
		replaceComponent(CoreComponentIds.Movable, component);
	}

	public void removeMovable() {
		removeComponent(CoreComponentIds.Movable);
	}

	public boolean Views() {
		return hasComponent(CoreComponentIds.Views);
	}

	public void setViews(boolean value) {
		if (value != hasComponent(CoreComponentIds.Views)) {
			if (value) {
				addComponent(CoreComponentIds.Views, viewsComponent);
			} else {
				removeComponent(CoreComponentIds.Views);
			}
		}
	}

	public Position getPosition() {
		return (Position) getComponent(CoreComponentIds.Position);
	}

	public boolean hasPosition() {
		return hasComponent(CoreComponentIds.Position);
	}

	public void addPosition(float _x, float _y) {
		Position component = createComponent(CoreComponentIds.Position,
				Position.class);
		component.x = _x;
		component.y = _y;
		addComponent(CoreComponentIds.Position, component);
	}

	public void replacePosition(float _x, float _y) {
		Position component = createComponent(CoreComponentIds.Position,
				Position.class);
		component.x = _x;
		component.y = _y;
		replaceComponent(CoreComponentIds.Position, component);
	}

	public void removePosition() {
		removeComponent(CoreComponentIds.Position);
	}
}