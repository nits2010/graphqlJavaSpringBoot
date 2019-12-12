package com.learning.links.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Author: Nitin Gupta
 * Date: 11/12/19
 * Description:
 */
@Data
@Entity
@NoArgsConstructor
public class Link {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "url", nullable = false)
    private String url;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "userid", nullable = false)
    private String userId;


}