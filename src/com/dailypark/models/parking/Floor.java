package com.dailypark.models.parking;

import com.dailypark.models.electronics.CustomerInfoPortal;
import com.dailypark.models.electronics.DisplayBoard;
import com.dailypark.models.parking.spots.Spot;

import java.util.List;

public class Floor {
    private CustomerInfoPortal customerInfoPortal;
    private List<Spot> spots;
    private DisplayBoard displayBoard;
}
