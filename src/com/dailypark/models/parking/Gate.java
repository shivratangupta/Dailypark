package com.dailypark.models.parking;

import com.dailypark.models.electronics.AutoExitPanel;
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

    @Override
    public void processPayment() {

    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public Attendant getAttendant() {
        return attendant;
    }

    public void setAttendant(Attendant attendant) {
        this.attendant = attendant;
    }

    public AutoExitPanel getExitPanel() {
        return exitPanel;
    }

    public void setExitPanel(AutoExitPanel exitPanel) {
        this.exitPanel = exitPanel;
    }
}
