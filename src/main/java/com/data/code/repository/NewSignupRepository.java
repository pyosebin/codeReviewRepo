package com.data.code.repository;


import com.data.code.domain.Account;

import javax.persistence.EntityManager;
import java.util.Optional;

public class NewSignupRepository implements SignupRepository {
    private final EntityManager em;
    public NewSignupRepository(EntityManager em) { this.em = em; }

    @Override
    public void save(Account account) {
        em.persist(account);
    }

}
