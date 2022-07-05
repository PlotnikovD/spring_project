package com.javastart.hellospring.controller.dto;

import com.javastart.hellospring.entity.Account;

import java.math.BigInteger;

public class AccountResponseDTO {

    private BigInteger id;
    private String name;
    private String email;
    private Integer age;

    public AccountResponseDTO(BigInteger id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public AccountResponseDTO(Account account){
        id = account.getId();
        name = account.getName();
        email = account.getEmail();
        age = account.getAge();
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

