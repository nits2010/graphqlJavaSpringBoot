package com.learning.vote.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.learning.links.model.Link;
import com.learning.links.repository.LinkRepository;
import com.learning.user.model.User;
import com.learning.user.repository.UserRepository;
import com.learning.vote.model.Vote;
import org.springframework.stereotype.Component;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description:
 */
@Component
public class VoteResolver implements GraphQLResolver<Vote> {

    private final LinkRepository linkRepository;
    private final UserRepository userRepository;

    public VoteResolver(LinkRepository linkRepository, UserRepository userRepository) {
        this.linkRepository = linkRepository;
        this.userRepository = userRepository;
    }

    public User user(Vote vote) {
        return userRepository.findById(vote.getUserId()).orElse(null);
    }

    public Link link(Vote vote) {
        return linkRepository.findById(vote.getLinkId()).orElse(null);
    }
}
