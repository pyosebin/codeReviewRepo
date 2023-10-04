package com.data.code.repository;

import com.data.code.domain.Account;

import javax.persistence.EntityManager;
import java.util.List;

public class NewAboutRepository implements AboutRepository {
    private final EntityManager em;
    public NewAboutRepository(EntityManager em) { this.em = em; }
    @Override
    public List<Account> findAll() {
        //DB 저장된 테이블 명이 아니라 Model에 있는 클래스명으로 맵핑된 테이블을 쿼리에 적어줘야 오류안남
        List<Account> result = em.createQuery("select m from Account m", Account.class)
                .getResultList();
        return result;
    }

    @Override
    public void delete(String userId) {
        em.createQuery("delete from Account m where m.userId = :userId")
                .setParameter("userId", userId)
                .executeUpdate();
        em.clear();
    }
}
