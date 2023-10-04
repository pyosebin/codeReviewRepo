package com.data.code.controller;

import com.data.code.domain.Account;
import com.data.code.service.LoginService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private LoginService loginService;

    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public Account login(@RequestParam String userId, Model model){
        Account accountInfo = loginService.findPassword(userId);
        return accountInfo;
    }
}
