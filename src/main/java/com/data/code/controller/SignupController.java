package com.data.code.controller;

import com.data.code.domain.Account;
import com.data.code.service.SignupService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SignupController {
    private SignupService signupService;

    public SignupController(SignupService signupService){
        this.signupService = signupService;
    }

    @GetMapping("/signup")
    public int signup(@RequestParam Map<String,String> paramMap, Model model)  throws Exception {
        Account account = new Account();
        account.setUsername(paramMap.get("username"));
        account.setUserId(paramMap.get("userId"));
        account.setPassword(paramMap.get("password"));
        signupService.join(account);
        return 1;
    }
}
