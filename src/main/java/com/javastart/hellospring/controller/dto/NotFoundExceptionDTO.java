package com.javastart.hellospring.controller.dto;


public class NotFoundExceptionDTO {

    public String message;

    public NotFoundExceptionDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
