package com.dailypark.models.parking.interfaces;

import com.dailypark.models.parking.Ticket;

public interface PaymentEnabled {
    public void processTicket(Ticket ticket);
    public void processPayment();
}
