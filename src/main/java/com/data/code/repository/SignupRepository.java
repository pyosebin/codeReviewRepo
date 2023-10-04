package com.data.code.repository;

import com.data.code.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SignupRepository {
    public void save(Account account);
}
