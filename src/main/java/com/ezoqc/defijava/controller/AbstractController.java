package com.ezoqc.defijava.controller;

import com.ezoqc.defijava.exception.NotFoundException;

public abstract class AbstractController {
    protected void isFound(Object o) {
        if (o == null)
            throw new NotFoundException();
    }
}
