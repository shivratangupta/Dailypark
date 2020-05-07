package com.dailypark.models.electronics;

import com.dailypark.models.parking.Ticket;
import com.dailypark.models.parking.interfaces.HasDisplay;
import com.dailypark.models.parking.interfaces.IssuesTicket;

public class EntrancePanel extends Electronics implements HasDisplay, IssuesTicket {
    @Override
    public void ShowMessage(String message) {

    }

    @Override
    public Ticket giveTicket() {
        return null;
    }
}
