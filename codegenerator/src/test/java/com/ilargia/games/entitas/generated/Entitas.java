package com.ilargia.games.entitas.generated;

import com.ilargia.games.entitas.Entity;
import com.ilargia.games.entitas.components.Views;
import com.ilargia.games.entitas.components.Movable;
import com.ilargia.games.entitas.components.Position;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp. Changes to
 * this file may cause incorrect behavior and will be lost.
 * 
 * ---------------------------------------------------------------------------
 */
public class Entitas {

	public static final Views viewsComponent = new Views();

	public static final boolean Views(Entity entity) {
		return entity.hasComponent(CoreComponentIds.Views);
	}

	public static final void setViews(Entity entity, boolean value) {
		if (value != entity.hasComponent(CoreComponentIds.Views)) {
			if (value) {
				entity.addComponent(CoreComponentIds.Views, viewsComponent);
			} else {
				entity.removeComponent(CoreComponentIds.Views);
			}
		}
	}

	public static Movable getMovable(Entity entity) {
		return (Movable) entity.getComponent(CoreComponentIds.Movable);
	}

	public static boolean hasMovable(Entity entity) {
		return entity.hasComponent(CoreComponentIds.Movable);
	}

	public static void addMovable(Entity entity, boolean _isMovable) {
		Movable component = entity.createComponent(CoreComponentIds.Movable,
				Movable.class);
		component.isMovable = _isMovable;
		entity.addComponent(CoreComponentIds.Movable, component);
	}

	public static void replaceMovable(Entity entity, boolean _isMovable) {
		Movable component = entity.createComponent(CoreComponentIds.Movable,
				Movable.class);
		component.isMovable = _isMovable;
		entity.replaceComponent(CoreComponentIds.Movable, component);
	}

	public static void removeMovable(Entity entity) {
		entity.removeComponent(CoreComponentIds.Movable);
	}

	public static Position getPosition(Entity entity) {
		return (Position) entity.getComponent(CoreComponentIds.Position);
	}

	public static boolean hasPosition(Entity entity) {
		return entity.hasComponent(CoreComponentIds.Position);
	}

	public static void addPosition(Entity entity, float _x, float _y) {
		Position component = entity.createComponent(CoreComponentIds.Position,
				Position.class);
		component.x = _x;
		component.y = _y;
		entity.addComponent(CoreComponentIds.Position, component);
	}

	public static void replacePosition(Entity entity, float _x, float _y) {
		Position component = entity.createComponent(CoreComponentIds.Position,
				Position.class);
		component.x = _x;
		component.y = _x;
		entity.replaceComponent(CoreComponentIds.Position, component);
	}

	public static void removePosition(Entity entity) {
		entity.removeComponent(CoreComponentIds.Position);
	}
}