package com.dailypark.models.vehicles;

import com.dailypark.models.DBObject;

public abstract class Vehicle extends DBObject {
    private String plateNumber;
    private String color;
    private final VehicleType type;

    public Vehicle(VehicleType type) {
        this.type = type;
    }
}
