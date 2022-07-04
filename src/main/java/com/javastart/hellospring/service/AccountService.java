package com.javastart.hellospring.service;

import java.util.*;

import com.javastart.hellospring.controller.dto.AccountEmailDTO;
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

    public AccountEmailDTO createAccount(String name, String email, Integer bill){
        Account account = new Account(name, email, bill);
        return new AccountEmailDTO(accountRepository.save(account).getEmail());
    }

    public Account getAccountById(Long id){
        return accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException());
    }

    public List<Account> getAll(){
        return accountRepository.findAll();
    }

    public Account deleteById(Long id){
        Account account = getAccountById(id);
        accountRepository.deleteById(id);
        return  account;
    }
}
