package com.learning.links.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.learning.links.model.Link;
import com.learning.links.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: Nitin Gupta
 * Date: 11/12/19
 * Description:
 */
@Component
public class LinkMutation implements GraphQLMutationResolver {

    @Autowired
    private LinkRepository linkRepository;

    public Link createLink(String url, String description) {
        Link newLink = new Link();
        newLink.setDescription(description);
        newLink.setUrl(url);
        linkRepository.save(newLink);
        return newLink;
    }

}

