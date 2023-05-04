package com.ezoqc.defijava.exception;

public class InvalidArgumentException extends Exception {

    public InvalidArgumentException() {
        super("L arqument reçu est incorrect.");
    }

    public InvalidArgumentException(String message) {
        super(message);
    }

}
