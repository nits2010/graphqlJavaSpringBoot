package com.learning.user.repository;

import com.learning.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description:
 */
@Repository
public interface UserRepository extends JpaRepository<User, String>, IUserRepository {


}
