package com.ezoqc.defijava.exception;

public class InvalidArgumentException extends Exception {

    public InvalidArgumentException() {
        super("L'argument reçu est incorrect.");
    }

    public InvalidArgumentException(String message) {
        super(message);
    }

}
