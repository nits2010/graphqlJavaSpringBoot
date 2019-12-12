package com.learning.vechicle.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.learning.vechicle.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.learning.vechicle.services.VehicleService;

import java.util.List;
import java.util.Optional;

/**
 * Author: Nitin Gupta
 * Date: 10/12/19
 * Description:
 */


@Component
public class VehicleQuery implements GraphQLQueryResolver {
    @Autowired
    private VehicleService vehicleService;

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }
}