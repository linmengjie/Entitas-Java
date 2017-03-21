package com.ilargia.games.egdx.logicbricks.gen.game;

import com.ilargia.games.entitas.api.*;
import com.ilargia.games.entitas.Entity;
import java.util.Stack;
import com.ilargia.games.egdx.logicbricks.component.game.Animations;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.ilargia.games.entitas.api.IComponent;
import java.util.Map;
import com.ilargia.games.egdx.logicbricks.component.game.Character;
import com.ilargia.games.egdx.logicbricks.data.StateCharacter;
import com.ilargia.games.egdx.logicbricks.component.game.Destroy;
import com.ilargia.games.egdx.logicbricks.component.game.InputController;
import com.ilargia.games.egdx.api.GameController;
import com.ilargia.games.egdx.impl.managers.InputManagerGDX;
import com.ilargia.games.egdx.logicbricks.gen.Entitas;
import com.ilargia.games.egdx.logicbricks.component.game.Interactive;
import com.ilargia.games.egdx.logicbricks.component.game.RigidBody;
import com.badlogic.gdx.physics.box2d.Body;
import com.ilargia.games.egdx.logicbricks.component.game.Tags;
import com.ilargia.games.egdx.logicbricks.component.sensor.CollisionSensor;
import com.ilargia.games.entitas.factories.EntitasCollections;
import java.util.Set;
import com.ilargia.games.egdx.logicbricks.component.game.TextureView;
import com.badlogic.gdx.graphics.Color;
import com.ilargia.games.egdx.logicbricks.data.Bounds;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class GameEntity extends Entity {

	public Destroy DestroyComponent = new Destroy();
	public Interactive InteractiveComponent = new Interactive();

	public GameEntity() {
	}

	public Animations getAnimations() {
		return (Animations) getComponent(GameComponentsLookup.Animations);
	}

	public boolean hasAnimations() {
		return hasComponent(GameComponentsLookup.Animations);
	}

	public GameEntity addAnimations(
			Map<String, Animation<TextureRegion>> animationStates,
			Animation<TextureRegion> currentAnimation, float time) {
		Animations component = (Animations) recoverComponent(GameComponentsLookup.Animations);
		if (component == null) {
			component = new Animations();
		}
		component.animationStates = animationStates;
		component.currentAnimation = currentAnimation;
		component.time = time;
		addComponent(GameComponentsLookup.Animations, component);
		return this;
	}

	public GameEntity replaceAnimations(
			Map<String, Animation<TextureRegion>> animationStates,
			Animation<TextureRegion> currentAnimation, float time) {
		Animations component = (Animations) recoverComponent(GameComponentsLookup.Animations);
		if (component == null) {
			component = new Animations();
		}
		component.animationStates = animationStates;
		component.currentAnimation = currentAnimation;
		component.time = time;
		replaceComponent(GameComponentsLookup.Animations, component);
		return this;
	}

	public GameEntity removeAnimations() {
		removeComponent(GameComponentsLookup.Animations);
		return this;
	}

	public Character getCharacter() {
		return (Character) getComponent(GameComponentsLookup.Character);
	}

	public boolean hasCharacter() {
		return hasComponent(GameComponentsLookup.Character);
	}

	public GameEntity addCharacter(String tag, StateCharacter currentState,
			boolean facingLeft) {
		Character component = (Character) recoverComponent(GameComponentsLookup.Character);
		if (component == null) {
			component = new Character();
		}
		component.tag = tag;
		component.currentState = currentState;
		component.facingLeft = facingLeft;
		addComponent(GameComponentsLookup.Character, component);
		return this;
	}

	public GameEntity replaceCharacter(String tag, StateCharacter currentState,
			boolean facingLeft) {
		Character component = (Character) recoverComponent(GameComponentsLookup.Character);
		if (component == null) {
			component = new Character();
		}
		component.tag = tag;
		component.currentState = currentState;
		component.facingLeft = facingLeft;
		replaceComponent(GameComponentsLookup.Character, component);
		return this;
	}

	public GameEntity removeCharacter() {
		removeComponent(GameComponentsLookup.Character);
		return this;
	}

	public boolean isDestroy() {
		return hasComponent(GameComponentsLookup.Destroy);
	}

	public GameEntity setDestroy(boolean value) {
		if (value != hasComponent(GameComponentsLookup.Destroy)) {
			if (value) {
				addComponent(GameComponentsLookup.Destroy, DestroyComponent);
			} else {
				removeComponent(GameComponentsLookup.Destroy);
			}
		}
		return this;
	}

	public InputController getInputController() {
		return (InputController) getComponent(GameComponentsLookup.InputController);
	}

	public boolean hasInputController() {
		return hasComponent(GameComponentsLookup.InputController);
	}

	public GameEntity addInputController(GameController controller) {
		InputController component = (InputController) recoverComponent(GameComponentsLookup.InputController);
		if (component == null) {
			component = new InputController(controller);
		} else {
			component.controller = controller;
		}
		addComponent(GameComponentsLookup.InputController, component);
		return this;
	}

	public GameEntity replaceInputController(GameController controller) {
		InputController component = (InputController) recoverComponent(GameComponentsLookup.InputController);
		if (component == null) {
			component = new InputController(controller);
		} else {
			component.controller = controller;
		}
		replaceComponent(GameComponentsLookup.InputController, component);
		return this;
	}

	public GameEntity removeInputController() {
		removeComponent(GameComponentsLookup.InputController);
		return this;
	}

	public boolean isInteractive() {
		return hasComponent(GameComponentsLookup.Interactive);
	}

	public GameEntity setInteractive(boolean value) {
		if (value != hasComponent(GameComponentsLookup.Interactive)) {
			if (value) {
				addComponent(GameComponentsLookup.Interactive,
						InteractiveComponent);
			} else {
				removeComponent(GameComponentsLookup.Interactive);
			}
		}
		return this;
	}

	public RigidBody getRigidBody() {
		return (RigidBody) getComponent(GameComponentsLookup.RigidBody);
	}

	public boolean hasRigidBody() {
		return hasComponent(GameComponentsLookup.RigidBody);
	}

	public GameEntity addRigidBody(Body body) {
		RigidBody component = (RigidBody) recoverComponent(GameComponentsLookup.RigidBody);
		if (component == null) {
			component = new RigidBody();
		}
		component.body = body;
		addComponent(GameComponentsLookup.RigidBody, component);
		return this;
	}

	public GameEntity replaceRigidBody(Body body) {
		RigidBody component = (RigidBody) recoverComponent(GameComponentsLookup.RigidBody);
		if (component == null) {
			component = new RigidBody();
		}
		component.body = body;
		replaceComponent(GameComponentsLookup.RigidBody, component);
		return this;
	}

	public GameEntity removeRigidBody() {
		removeComponent(GameComponentsLookup.RigidBody);
		return this;
	}

	public Tags getTags() {
		return (Tags) getComponent(GameComponentsLookup.Tags);
	}

	public boolean hasTags() {
		return hasComponent(GameComponentsLookup.Tags);
	}

	public GameEntity addTags(String... values) {
		Tags component = (Tags) recoverComponent(GameComponentsLookup.Tags);
		if (component == null) {
			component = new Tags(values);
		} else {
			if (component.values == null) {
				component.values = EntitasCollections.createSet(String.class);
			} else {
				component.values.clear();
			}
			for (String value : values) {
				component.values.add(value);
			}
		}
		addComponent(GameComponentsLookup.Tags, component);
		return this;
	}

	public GameEntity replaceTags(String... values) {
		Tags component = (Tags) recoverComponent(GameComponentsLookup.Tags);
		if (component == null) {
			component = new Tags(values);
		} else {
			if (component.values == null) {
				component.values = EntitasCollections.createSet(String.class);
			} else {
				component.values.clear();
			}
			for (String value : values) {
				component.values.add(value);
			}
		}
		replaceComponent(GameComponentsLookup.Tags, component);
		return this;
	}

	public GameEntity removeTags() {
		removeComponent(GameComponentsLookup.Tags);
		return this;
	}

	public TextureView getTextureView() {
		return (TextureView) getComponent(GameComponentsLookup.TextureView);
	}

	public boolean hasTextureView() {
		return hasComponent(GameComponentsLookup.TextureView);
	}

	public GameEntity addTextureView(TextureRegion texture, Bounds bounds,
			boolean flipX, boolean flipY, int opacity, int layer, Color tint) {
		TextureView component = (TextureView) recoverComponent(GameComponentsLookup.TextureView);
		if (component == null) {
			component = new TextureView(texture, bounds, flipX, flipY, opacity,
					layer, tint);
		} else {
			component.texture = texture;
			component.bounds = bounds;
			component.flipX = flipX;
			component.flipY = flipY;
			component.opacity = opacity;
			component.layer = layer;
			component.tint = tint;
		}
		addComponent(GameComponentsLookup.TextureView, component);
		return this;
	}

	public GameEntity replaceTextureView(TextureRegion texture, Bounds bounds,
			boolean flipX, boolean flipY, int opacity, int layer, Color tint) {
		TextureView component = (TextureView) recoverComponent(GameComponentsLookup.TextureView);
		if (component == null) {
			component = new TextureView(texture, bounds, flipX, flipY, opacity,
					layer, tint);
		} else {
			component.texture = texture;
			component.bounds = bounds;
			component.flipX = flipX;
			component.flipY = flipY;
			component.opacity = opacity;
			component.layer = layer;
			component.tint = tint;
		}
		replaceComponent(GameComponentsLookup.TextureView, component);
		return this;
	}

	public GameEntity removeTextureView() {
		removeComponent(GameComponentsLookup.TextureView);
		return this;
	}
}