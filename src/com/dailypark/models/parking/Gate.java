package com.dailypark.models.parking;

import com.dailypark.models.DBObject;

public abstract class Gate extends DBObject {
    private GateType type;
    private String gateName;

    abstract void open();
    abstract void close();
}
