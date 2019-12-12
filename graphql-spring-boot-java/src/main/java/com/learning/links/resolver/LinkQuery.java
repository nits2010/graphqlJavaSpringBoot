package com.learning.links.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.learning.links.model.Link;
import com.learning.links.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: Nitin Gupta
 * Date: 11/12/19
 * Description:
 */
@Component
public class LinkQuery implements GraphQLQueryResolver{

    @Autowired
    private LinkRepository linkRepository;

    //Bind to Query { allLinks: [Link] }
    public List<Link> getAllLinks() {
        return linkRepository.findAll();
    }
}
