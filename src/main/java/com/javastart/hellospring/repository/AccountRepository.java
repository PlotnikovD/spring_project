package com.javastart.hellospring.repository;

import com.javastart.hellospring.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AccountRepository extends JpaRepository<Account, BigInteger> {



}

