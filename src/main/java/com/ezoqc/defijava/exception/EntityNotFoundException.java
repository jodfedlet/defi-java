package com.ezoqc.defijava.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException() {
        super("L'entité demandée n'a pas été trouvée");
    }

    public EntityNotFoundException(String message) {
        super(message);
    }

}
