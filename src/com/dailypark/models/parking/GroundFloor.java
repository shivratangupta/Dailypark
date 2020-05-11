package com.dailypark.models.parking;

import com.dailypark.models.electronics.DisplayBoard;
import com.dailypark.models.electronics.EntrancePanel;

public class GroundFloor extends Floor {
    private EntrancePanel entrancePanel;

    public GroundFloor(String name) {
        super(name);
    }

    public EntrancePanel getEntrancePanel() {
        return entrancePanel;
    }

    public void setEntrancePanel(EntrancePanel entrancePanel) {
        this.entrancePanel = entrancePanel;
    }
}
