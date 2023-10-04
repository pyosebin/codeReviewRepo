package com.data.code.repository;

import com.data.code.domain.Account;
import java.util.Optional;

public interface LoginRepository {
    public Optional<Account> loginByUserId(String userId);
}
