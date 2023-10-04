package com.data.code.service;

import com.data.code.domain.Account;
import com.data.code.repository.LoginRepository;
import com.data.code.repository.SignupRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Transactional
public class SignupService {
    private final SignupRepository signupRepository;

    public SignupService(SignupRepository signupRepository) {
        this.signupRepository = signupRepository;
    }
    @Transactional
    public void join(Account account) {
        signupRepository.save(account);
    }
}
