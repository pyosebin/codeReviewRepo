package com.data.code.service;

import com.data.code.domain.Account;
import com.data.code.repository.AboutRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public class AboutService {
    private final AboutRepository aboutRepository;

    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public List<Account> findNames(){
        return aboutRepository.findAll();
    }

    @Transactional
    public void delete(String userId) {
        aboutRepository.delete(userId);
    }
}
