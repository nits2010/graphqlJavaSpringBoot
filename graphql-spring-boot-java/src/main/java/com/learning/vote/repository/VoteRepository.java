package com.learning.vote.repository;

import com.learning.vote.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description:
 */
public interface VoteRepository extends JpaRepository<Vote, UUID> {
}
