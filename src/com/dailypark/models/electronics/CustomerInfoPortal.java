package com.dailypark.models.electronics;

import com.dailypark.models.parking.Ticket;
import com.dailypark.models.parking.interfaces.PaymentEnabled;

public class CustomerInfoPortal extends Electronics implements PaymentEnabled {
    @Override
    public void processTicket(Ticket ticket) {

    }
}
