package com.learning.links.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.learning.links.model.Link;
import com.learning.user.model.User;
import com.learning.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description: Create LinkResolver to contain the link manipulation logic (Link simply holds data)
 */
@Component
public class LinkResolver implements GraphQLResolver<Link> {


    @Autowired
    private UserRepository userRepository;

    public User postedBy(Link link) {
        if (link.getUserId() == null)
            return null;
        return userRepository.findById(link.getUserId()).orElse(null);
    }
}
