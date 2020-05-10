package com.dailypark.models.parking.spots;

import com.dailypark.models.DBObject;
import com.dailypark.models.vehicles.Vehicle;

public abstract class Spot extends DBObject {
    private final SpotType type;
    private SpotStatus status;
    private Vehicle vehicle;

    public Spot(SpotType type) {
        this.type = type;
    }

    public SpotType getType() {
        return type;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    public void park(Vehicle vehicle) {

    }

    public Vehicle unPark() {
        return vehicle;
    }
}
