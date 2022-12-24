package com.devsuperior.dslearnbds.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String mensage) {
        super(mensage);
    }
}
