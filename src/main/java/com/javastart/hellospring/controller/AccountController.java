package com.javastart.hellospring.controller;

import java.math.BigInteger;
import java.util.*;

import com.javastart.hellospring.controller.dto.AccountRequestDTO;
import com.javastart.hellospring.controller.dto.AccountResponseDTO;
import com.javastart.hellospring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/hello")
    public String helloSpring(){
        return "Hello Spring!";
    }

    @PostMapping("/accounts")
    public AccountResponseDTO createAccount(@RequestBody AccountRequestDTO accountRequestDTO){
        //return accountService.createAccount(accountRequestDTO.getName(), accountRequestDTO.getEmail(), accountRequestDTO.getAge());
        return accountService.createAccount(accountRequestDTO);

    }

    @GetMapping("/accounts/{id}")
    public AccountResponseDTO getAccount(@PathVariable BigInteger id){
        return new AccountResponseDTO(accountService.getAccountById(id));

    }
    @GetMapping("/accounts")
    public List<AccountResponseDTO> getAll(){
        return accountService.getAll().stream().map(AccountResponseDTO::new).collect(Collectors.toList());
    }
    @DeleteMapping("/accounts/{id}")
    public AccountResponseDTO delete(@PathVariable BigInteger id){
        return new AccountResponseDTO(accountService.deleteById(id));
    }
}
