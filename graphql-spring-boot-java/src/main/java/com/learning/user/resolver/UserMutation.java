package com.learning.user.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.learning.user.model.AuthData;
import com.learning.user.model.SigninPayload;
import com.learning.user.model.User;
import com.learning.user.repository.UserRepository;
import graphql.GraphQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description:
 */
@Component
public class UserMutation implements GraphQLMutationResolver {

    @Autowired
    private UserRepository userRepository;

    public User createUser(String name, AuthData authData) {
        User user = User.builder().name(name).password(authData.getPassword()).email(authData.getEmail()).build();
        return userRepository.save(user);
    }

    public SigninPayload signinUser(AuthData auth) throws IllegalAccessException {
        User user = userRepository.findByEmailId(auth.getEmail());
        if (user.getPassword().equals(auth.getPassword())) {
            return new SigninPayload(user.getId(), user);
        }
        throw new GraphQLException("Invalid credentials");
    }
}
