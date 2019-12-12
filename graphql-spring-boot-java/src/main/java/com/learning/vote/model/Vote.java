package com.learning.vote.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description:
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Vote {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "createdAt", nullable = false)
    private ZonedDateTime createdAt;
    @Column(name = "userId", nullable = false)
    private String userId;
    @Column(name = "linkId", nullable = false)
    private int linkId;


    public Vote(ZonedDateTime now, String userId, int linkId) {
        this.createdAt = now;
        this.userId = userId;
        this.linkId = linkId;
    }
}
