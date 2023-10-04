package com.data.code.repository;


import com.data.code.domain.Account;
import javax.persistence.EntityManager;
import java.util.Optional;

public class NewLoginRepository implements LoginRepository {
    private final EntityManager em;
    public NewLoginRepository(EntityManager em) { this.em = em; }
    @Override
    public Optional<Account> loginByUserId(String userId) {
         return em.createQuery("select m from Account m where m.userId = :userId", Account.class)
                .setParameter("userId", userId)
                .getResultList().stream().findAny();
    }
}
