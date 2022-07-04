package com.javastart.hellospring.controller.dto;

public class AccountEmailDTO {

    private String email;

    public AccountEmailDTO(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
