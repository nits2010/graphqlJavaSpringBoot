package com.learning.vechicle.resolver;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.learning.vechicle.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.learning.vechicle.services.VehicleService;

/**
 * Author: Nitin Gupta
 * Date: 10/12/19
 * Description:
 */
@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;
    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}