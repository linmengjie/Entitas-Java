package com.ilargia.games.entitas.exceptions;

import com.ilargia.games.entitas.api.entitas.IEntity;

public class EntityIsNotRetainedByOwnerException extends RuntimeException {

    public EntityIsNotRetainedByOwnerException(IEntity entity, Object owner) {
        super("'" + owner + "' cannot retain " + entity + "!\n" +
                "Entity is already retained by this object!" +
                "The entity must be released by this object first.");
    }

}