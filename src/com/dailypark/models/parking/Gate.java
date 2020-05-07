package com.dailypark.models.parking;

import com.dailypark.models.AutoExitPanel;
import com.dailypark.models.DBObject;
import com.dailypark.models.accounts.Attendant;
import com.dailypark.models.parking.interfaces.PaymentEnabled;

public class Gate extends DBObject implements PaymentEnabled {
    private GateType type;
    private String gateName;
    private Attendant attendant;
    private AutoExitPanel exitPanel;

    void open() {

    }

    void close() {

    }

    void getTicket() {

    }

    @Override
    public void processTicket(Ticket ticket) {

    }
}
