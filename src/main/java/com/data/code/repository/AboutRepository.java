package com.data.code.repository;

import com.data.code.domain.Account;

import java.util.List;

public interface AboutRepository {
    List<Account> findAll();

    void delete(String userId);
}
