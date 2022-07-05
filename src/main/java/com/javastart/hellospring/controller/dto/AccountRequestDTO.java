package com.javastart.hellospring.controller.dto;

public class AccountRequestDTO {

    private String name;
    private String email;
    private Integer age;

    public AccountRequestDTO(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public AccountRequestDTO(){
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

    public void setBill(Integer age) {
        this.age = age;
    }
}