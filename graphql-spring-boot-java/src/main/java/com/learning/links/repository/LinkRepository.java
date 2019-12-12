package com.learning.links.repository;

import com.learning.links.model.Link;
import com.learning.vechicle.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Nitin Gupta
 * Date: 11/12/19
 * Description:
 */
@Repository
public interface LinkRepository extends JpaRepository<Link, Integer> {


}
