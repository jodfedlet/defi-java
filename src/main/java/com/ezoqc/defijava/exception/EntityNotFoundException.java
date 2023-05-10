package com.ezoqc.defijava.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException() {
        super("L'entité demandée n'a pas été trouvée");
    }

    public EntityNotFoundException(String message) {
        super(message);
    }

}
