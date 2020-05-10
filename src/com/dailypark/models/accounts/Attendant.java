package com.dailypark.models.accounts;

import com.dailypark.models.parking.Ticket;
import com.dailypark.models.parking.interfaces.IssuesTicket;
import com.dailypark.models.parking.interfaces.PaymentEnabled;
import com.dailypark.models.people.Person;

public class Attendant extends Account implements IssuesTicket, PaymentEnabled {
    public Attendant(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }

    @Override
    public Ticket giveTicket() {
        return null;
    }

    @Override
    public void processTicket(Ticket ticket) {

    }

    @Override
    public void processPayment() {

    }
}
