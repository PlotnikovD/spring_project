package com.javastart.hellospring.service;

import java.math.BigInteger;
import java.util.*;

import com.javastart.hellospring.controller.dto.AccountRequestDTO;
import com.javastart.hellospring.controller.dto.AccountResponseDTO;
import com.javastart.hellospring.entity.Account;
import com.javastart.hellospring.exception.AccountNotFoundException;
import com.javastart.hellospring.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private  final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountResponseDTO createAccount(AccountRequestDTO accountRequestDTO){
        Account account = new Account(accountRequestDTO.getName(), accountRequestDTO.getEmail(), accountRequestDTO.getAge());
        accountRepository.save(account);
        return new AccountResponseDTO(account.getId(), account.getName(), account.getEmail(), account.getAge());
    }

    public Account getAccountById(BigInteger id){
        return accountRepository.findById(id).orElseThrow(() ->
                new AccountNotFoundException("Account with id " + id + " not found"));
    }

    public List<Account> getAll(){
        return accountRepository.findAll();
    }

    public Account deleteById(BigInteger id){
        Account account = getAccountById(id);
        accountRepository.deleteById(id);
        return  account;
    }
}
