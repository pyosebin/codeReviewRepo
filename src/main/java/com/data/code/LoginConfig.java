package com.data.code;

import com.data.code.repository.LoginRepository;
import com.data.code.repository.NewLoginRepository;
import com.data.code.service.LoginService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class LoginConfig {
    private final DataSource dataSource;
    private final EntityManager em;
    public LoginConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

    @Bean
    public LoginService loginService() { return new LoginService(loginRepository()); }

    @Bean
    public LoginRepository loginRepository() { return new NewLoginRepository(em); }

}
