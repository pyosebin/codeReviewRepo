package com.data.code.controller;

import com.data.code.domain.Account;
import com.data.code.service.AboutService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AboutController {
    private AboutService aboutService;

    public AboutController(AboutService aboutService){
        this.aboutService = aboutService;
    }

    @GetMapping("/about")
    public List<Account> test(Model model){
        List<Account> testName = aboutService.findNames();
        String nameList = testName.get(0).getUsername();
        return testName;
    }

    @DeleteMapping("/about/delete")
    public int delete(@RequestBody Map<String, String> data, Model model){
        aboutService.delete(data.get("userId"));
        return 1;
    }
}