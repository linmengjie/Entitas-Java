package com.ilargia.games.egdx.logicbricks.gen.actuator;

import com.ilargia.games.entitas.api.*;
import com.ilargia.games.entitas.Entity;
import java.util.Stack;
import com.ilargia.games.egdx.logicbricks.component.actuator.CameraActuator;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.Transform;
import com.ilargia.games.egdx.logicbricks.component.game.RigidBody;
import com.ilargia.games.egdx.logicbricks.data.interfaces.Actuator;
import com.ilargia.games.egdx.logicbricks.gen.game.GameEntity;
import com.ilargia.games.egdx.logicbricks.index.Indexed;
import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.egdx.logicbricks.component.actuator.DragActuator;
import com.ilargia.games.egdx.logicbricks.data.StateCharacter;
import com.ilargia.games.egdx.logicbricks.component.actuator.Link;
import com.ilargia.games.egdx.logicbricks.component.actuator.ParticleEffectActuator;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.ilargia.games.egdx.logicbricks.component.actuator.RadialGravityActuator;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.ilargia.games.egdx.logicbricks.gen.sensor.SensorContext;
import com.ilargia.games.egdx.logicbricks.component.actuator.TextureActuator;
import com.badlogic.gdx.graphics.Color;
import com.ilargia.games.egdx.logicbricks.component.game.TextureView;
import com.ilargia.games.egdx.logicbricks.data.Bounds;
import com.ilargia.games.egdx.logicbricks.component.actuator.VelocityActuator;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class ActuatorEntity extends Entity {

	public ActuatorEntity() {
	}

	public CameraActuator getCameraActuator() {
		return (CameraActuator) getComponent(ActuatorComponentsLookup.CameraActuator);
	}

	public boolean hasCameraActuator() {
		return hasComponent(ActuatorComponentsLookup.CameraActuator);
	}

	public ActuatorEntity addCameraActuator(Camera camera, short height,
			float damping, float minDistanceX, float minDistanceY,
			String followTagEntity) {
		CameraActuator component = (CameraActuator) recoverComponent(ActuatorComponentsLookup.CameraActuator);
		if (component == null) {
			component = new CameraActuator(camera, height, damping,
					minDistanceX, minDistanceY, followTagEntity);
		} else {
			component.actuator = (indexOwner) -> {
				GameEntity followEntity = Indexed.getTagEntity(followTagEntity);
				if (followEntity != null) {
					RigidBody rc = followEntity.getRigidBody();
					Transform transform = rc.body.getTransform();
					Vector3 position = camera.position;
					position.x += (transform.getPosition().x + minDistanceX - position.x)
							* damping;
					position.y += (transform.getPosition().y + minDistanceY - position.y)
							* height;
				}
			};
		}
		addComponent(ActuatorComponentsLookup.CameraActuator, component);
		return this;
	}

	public ActuatorEntity replaceCameraActuator(Camera camera, short height,
			float damping, float minDistanceX, float minDistanceY,
			String followTagEntity) {
		CameraActuator component = (CameraActuator) recoverComponent(ActuatorComponentsLookup.CameraActuator);
		if (component == null) {
			component = new CameraActuator(camera, height, damping,
					minDistanceX, minDistanceY, followTagEntity);
		} else {
			component.actuator = (indexOwner) -> {
				GameEntity followEntity = Indexed.getTagEntity(followTagEntity);
				if (followEntity != null) {
					RigidBody rc = followEntity.getRigidBody();
					Transform transform = rc.body.getTransform();
					Vector3 position = camera.position;
					position.x += (transform.getPosition().x + minDistanceX - position.x)
							* damping;
					position.y += (transform.getPosition().y + minDistanceY - position.y)
							* height;
				}
			};
		}
		replaceComponent(ActuatorComponentsLookup.CameraActuator, component);
		return this;
	}

	public ActuatorEntity removeCameraActuator() {
		removeComponent(ActuatorComponentsLookup.CameraActuator);
		return this;
	}

	public DragActuator getDragActuator() {
		return (DragActuator) getComponent(ActuatorComponentsLookup.DragActuator);
	}

	public boolean hasDragActuator() {
		return hasComponent(ActuatorComponentsLookup.DragActuator);
	}

	public ActuatorEntity addDragActuator(int targetEntity,
			boolean collideConnected, float maxForce) {
		DragActuator component = (DragActuator) recoverComponent(ActuatorComponentsLookup.DragActuator);
		if (component == null) {
			component = new DragActuator(targetEntity, collideConnected,
					maxForce);
		} else {
			component.targetEntity = targetEntity;
			component.collideConnected = collideConnected;
			component.maxForce = maxForce;
		}
		addComponent(ActuatorComponentsLookup.DragActuator, component);
		return this;
	}

	public ActuatorEntity replaceDragActuator(int targetEntity,
			boolean collideConnected, float maxForce) {
		DragActuator component = (DragActuator) recoverComponent(ActuatorComponentsLookup.DragActuator);
		if (component == null) {
			component = new DragActuator(targetEntity, collideConnected,
					maxForce);
		} else {
			component.targetEntity = targetEntity;
			component.collideConnected = collideConnected;
			component.maxForce = maxForce;
		}
		replaceComponent(ActuatorComponentsLookup.DragActuator, component);
		return this;
	}

	public ActuatorEntity removeDragActuator() {
		removeComponent(ActuatorComponentsLookup.DragActuator);
		return this;
	}

	public Link getLink() {
		return (Link) getComponent(ActuatorComponentsLookup.Link);
	}

	public boolean hasLink() {
		return hasComponent(ActuatorComponentsLookup.Link);
	}

	public ActuatorEntity addLink(int ownerEntity, String nameReference,
			boolean isOpen) {
		Link component = (Link) recoverComponent(ActuatorComponentsLookup.Link);
		if (component == null) {
			component = new Link(ownerEntity, nameReference, isOpen);
		} else {
			component.nameReference = nameReference;
			component.ownerEntity = ownerEntity;
			component.isOpen = isOpen;
		}
		addComponent(ActuatorComponentsLookup.Link, component);
		return this;
	}

	public ActuatorEntity replaceLink(int ownerEntity, String nameReference,
			boolean isOpen) {
		Link component = (Link) recoverComponent(ActuatorComponentsLookup.Link);
		if (component == null) {
			component = new Link(ownerEntity, nameReference, isOpen);
		} else {
			component.nameReference = nameReference;
			component.ownerEntity = ownerEntity;
			component.isOpen = isOpen;
		}
		replaceComponent(ActuatorComponentsLookup.Link, component);
		return this;
	}

	public ActuatorEntity removeLink() {
		removeComponent(ActuatorComponentsLookup.Link);
		return this;
	}

	public ParticleEffectActuator getParticleEffectActuator() {
		return (ParticleEffectActuator) getComponent(ActuatorComponentsLookup.ParticleEffectActuator);
	}

	public boolean hasParticleEffectActuator() {
		return hasComponent(ActuatorComponentsLookup.ParticleEffectActuator);
	}

	public ActuatorEntity addParticleEffectActuator(ParticleEffect effect,
			boolean autoStart, float locaPosX, float locaPosY) {
		ParticleEffectActuator component = (ParticleEffectActuator) recoverComponent(ActuatorComponentsLookup.ParticleEffectActuator);
		if (component == null) {
			component = new ParticleEffectActuator(effect, autoStart, locaPosX,
					locaPosY);
		} else {
			component.particleEffect = effect;
			component.actuator = (indexOwner) -> {
				GameEntity owner = Indexed.getInteractiveEntity(indexOwner);
				RigidBody rc = owner.getRigidBody();
				Transform transform = rc.body.getTransform();
				effect.setPosition(transform.getPosition().x + locaPosX,
						transform.getPosition().y + locaPosY);
				effect.update(Gdx.graphics.getDeltaTime());
				if (autoStart && effect.isComplete())
					effect.start();
			};
		}
		addComponent(ActuatorComponentsLookup.ParticleEffectActuator, component);
		return this;
	}

	public ActuatorEntity replaceParticleEffectActuator(ParticleEffect effect,
			boolean autoStart, float locaPosX, float locaPosY) {
		ParticleEffectActuator component = (ParticleEffectActuator) recoverComponent(ActuatorComponentsLookup.ParticleEffectActuator);
		if (component == null) {
			component = new ParticleEffectActuator(effect, autoStart, locaPosX,
					locaPosY);
		} else {
			component.particleEffect = effect;
			component.actuator = (indexOwner) -> {
				GameEntity owner = Indexed.getInteractiveEntity(indexOwner);
				RigidBody rc = owner.getRigidBody();
				Transform transform = rc.body.getTransform();
				effect.setPosition(transform.getPosition().x + locaPosX,
						transform.getPosition().y + locaPosY);
				effect.update(Gdx.graphics.getDeltaTime());
				if (autoStart && effect.isComplete())
					effect.start();
			};
		}
		replaceComponent(ActuatorComponentsLookup.ParticleEffectActuator,
				component);
		return this;
	}

	public ActuatorEntity removeParticleEffectActuator() {
		removeComponent(ActuatorComponentsLookup.ParticleEffectActuator);
		return this;
	}

	public RadialGravityActuator getRadialGravityActuator() {
		return (RadialGravityActuator) getComponent(ActuatorComponentsLookup.RadialGravityActuator);
	}

	public boolean hasRadialGravityActuator() {
		return hasComponent(ActuatorComponentsLookup.RadialGravityActuator);
	}

	public ActuatorEntity addRadialGravityActuator(float gravity, float radius,
			float gravityFactor) {
		RadialGravityActuator component = (RadialGravityActuator) recoverComponent(ActuatorComponentsLookup.RadialGravityActuator);
		if (component == null) {
			component = new RadialGravityActuator(gravity, radius,
					gravityFactor);
		} else {
			component.gravity = gravity;
			component.radius = radius;
			component.gravityFactor = gravityFactor;
		}
		addComponent(ActuatorComponentsLookup.RadialGravityActuator, component);
		return this;
	}

	public ActuatorEntity replaceRadialGravityActuator(float gravity,
			float radius, float gravityFactor) {
		RadialGravityActuator component = (RadialGravityActuator) recoverComponent(ActuatorComponentsLookup.RadialGravityActuator);
		if (component == null) {
			component = new RadialGravityActuator(gravity, radius,
					gravityFactor);
		} else {
			component.gravity = gravity;
			component.radius = radius;
			component.gravityFactor = gravityFactor;
		}
		replaceComponent(ActuatorComponentsLookup.RadialGravityActuator,
				component);
		return this;
	}

	public ActuatorEntity removeRadialGravityActuator() {
		removeComponent(ActuatorComponentsLookup.RadialGravityActuator);
		return this;
	}

	public TextureActuator getTextureActuator() {
		return (TextureActuator) getComponent(ActuatorComponentsLookup.TextureActuator);
	}

	public boolean hasTextureActuator() {
		return hasComponent(ActuatorComponentsLookup.TextureActuator);
	}

	public ActuatorEntity addTextureActuator(Bounds bounds, int opacity,
			Boolean flipX, Boolean flipY, Color tint) {
		TextureActuator component = (TextureActuator) recoverComponent(ActuatorComponentsLookup.TextureActuator);
		if (component == null) {
			component = new TextureActuator(bounds, opacity, flipX, flipY, tint);
		} else {
			component.actuator = (indexOwner) -> {
				GameEntity owner = Indexed.getInteractiveEntity(indexOwner);
				TextureView view = owner.getTextureView();
				if (bounds != null)
					view.bounds = bounds;
				if (flipX != null)
					view.flipX = flipX;
				if (flipY != null)
					view.flipY = flipY;
				if (opacity != -1)
					view.opacity = opacity;
				if (tint != null)
					view.tint = tint;
			};
		}
		addComponent(ActuatorComponentsLookup.TextureActuator, component);
		return this;
	}

	public ActuatorEntity replaceTextureActuator(Bounds bounds, int opacity,
			Boolean flipX, Boolean flipY, Color tint) {
		TextureActuator component = (TextureActuator) recoverComponent(ActuatorComponentsLookup.TextureActuator);
		if (component == null) {
			component = new TextureActuator(bounds, opacity, flipX, flipY, tint);
		} else {
			component.actuator = (indexOwner) -> {
				GameEntity owner = Indexed.getInteractiveEntity(indexOwner);
				TextureView view = owner.getTextureView();
				if (bounds != null)
					view.bounds = bounds;
				if (flipX != null)
					view.flipX = flipX;
				if (flipY != null)
					view.flipY = flipY;
				if (opacity != -1)
					view.opacity = opacity;
				if (tint != null)
					view.tint = tint;
			};
		}
		replaceComponent(ActuatorComponentsLookup.TextureActuator, component);
		return this;
	}

	public ActuatorEntity removeTextureActuator() {
		removeComponent(ActuatorComponentsLookup.TextureActuator);
		return this;
	}

	public VelocityActuator getVelocityActuator() {
		return (VelocityActuator) getComponent(ActuatorComponentsLookup.VelocityActuator);
	}

	public boolean hasVelocityActuator() {
		return hasComponent(ActuatorComponentsLookup.VelocityActuator);
	}

	public ActuatorEntity addVelocityActuator(Vector2 velocity,
			float angularVelocity) {
		VelocityActuator component = (VelocityActuator) recoverComponent(ActuatorComponentsLookup.VelocityActuator);
		if (component == null) {
			component = new VelocityActuator(velocity, angularVelocity);
		} else {
			component.actuator = (indexOwner) -> {
				GameEntity owner = Indexed.getInteractiveEntity(indexOwner);
				RigidBody rigidBody = owner.getRigidBody();
				rigidBody.body.setLinearVelocity(velocity);
				rigidBody.body.setAngularVelocity(angularVelocity);
			};
		}
		addComponent(ActuatorComponentsLookup.VelocityActuator, component);
		return this;
	}

	public ActuatorEntity replaceVelocityActuator(Vector2 velocity,
			float angularVelocity) {
		VelocityActuator component = (VelocityActuator) recoverComponent(ActuatorComponentsLookup.VelocityActuator);
		if (component == null) {
			component = new VelocityActuator(velocity, angularVelocity);
		} else {
			component.actuator = (indexOwner) -> {
				GameEntity owner = Indexed.getInteractiveEntity(indexOwner);
				RigidBody rigidBody = owner.getRigidBody();
				rigidBody.body.setLinearVelocity(velocity);
				rigidBody.body.setAngularVelocity(angularVelocity);
			};
		}
		replaceComponent(ActuatorComponentsLookup.VelocityActuator, component);
		return this;
	}

	public ActuatorEntity removeVelocityActuator() {
		removeComponent(ActuatorComponentsLookup.VelocityActuator);
		return this;
	}
}