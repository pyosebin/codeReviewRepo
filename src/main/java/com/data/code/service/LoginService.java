package com.data.code.service;

import com.data.code.domain.Account;
import com.data.code.repository.LoginRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Transactional
public class LoginService {
    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }
    public Account findPassword(String userId){
        Optional<Account> memberList = loginRepository.loginByUserId(userId);
        if (memberList.isEmpty()) {
            throw new IllegalStateException("아이디와 비밀번호가 일치하지 않습니다.");
        }
        return memberList.get();
    }
}
