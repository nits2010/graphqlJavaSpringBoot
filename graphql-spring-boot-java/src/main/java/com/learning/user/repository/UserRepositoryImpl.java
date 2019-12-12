package com.learning.user.repository;

import com.learning.user.model.User;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description:
 */
@Repository
@Transactional
public class UserRepositoryImpl implements IUserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findByEmailId(String emailId) {
        Query query = entityManager.createNativeQuery("SELECT * FROM user as u WHERE u.email is ?", User.class);
        query.setParameter(1, emailId);
        return (User) query.getSingleResult();
    }
}
