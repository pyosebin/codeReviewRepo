package com.data.code;

import com.data.code.repository.LoginRepository;
import com.data.code.repository.NewLoginRepository;
import com.data.code.repository.NewSignupRepository;
import com.data.code.repository.SignupRepository;
import com.data.code.service.LoginService;
import com.data.code.service.SignupService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SignupConfig {
    private final DataSource dataSource;
    private final EntityManager em;
    public SignupConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

    @Bean
    public SignupService signupService() { return new SignupService(signupRepository()); }

    @Bean
    public SignupRepository signupRepository() { return new NewSignupRepository(em); }

}
