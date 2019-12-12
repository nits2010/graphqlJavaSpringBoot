package com.learning.user.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.learning.user.model.SigninPayload;
import com.learning.user.model.User;
import org.springframework.stereotype.Component;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description:Because SigninPayload data class contains a complex (non-scalar) object User, it needs a companion resolver class
 */
@Component
public class SigninResolver implements GraphQLResolver<SigninResolver> {
    public User user(SigninPayload payload) {
        return payload.getUser();
    }
}
