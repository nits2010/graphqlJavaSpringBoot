package com.learning.user.repository;

import com.learning.user.model.User;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description:
 */
public interface IUserRepository {

    User findByEmailId(String emailId);
}
