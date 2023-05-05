package com.ezoqc.defijava.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidArgumentException extends Exception {

    public InvalidArgumentException() {
        super("L'argument reçu est incorrect.");
    }

    public InvalidArgumentException(String message) {
        super(message);
    }

}
