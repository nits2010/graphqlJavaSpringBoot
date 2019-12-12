package com.learning.vote.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.learning.vote.model.Vote;
import com.learning.vote.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description:
 */
@Component
public class VoteMutation implements GraphQLMutationResolver {

    @Autowired
    private VoteRepository voteRepository;

    public Vote createVote(int linkId, String userId) {
        ZonedDateTime now = Instant.now().atZone(ZoneOffset.UTC);
        return voteRepository.save(new Vote(now, userId, linkId));
    }
}
