package com.learning.repository;

import com.learning.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Nitin Gupta
 * Date: 10/12/19
 * Description:
 */
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}