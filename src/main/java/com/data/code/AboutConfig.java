package com.data.code;

import com.data.code.repository.AboutRepository;
import com.data.code.repository.NewAboutRepository;
import com.data.code.service.AboutService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class AboutConfig {
    private final DataSource dataSource;
    private final EntityManager em;
    public AboutConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

    @Bean
    public AboutService memberService() { return new AboutService(aboutRepository()); }

    @Bean
    public AboutRepository aboutRepository() { return new NewAboutRepository(em); }

}
