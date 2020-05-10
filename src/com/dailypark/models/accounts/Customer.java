package com.dailypark.models.accounts;

import com.dailypark.models.people.Person;
import sun.security.krb5.internal.Ticket;

public class Customer extends Account {
    public Customer(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }

    public Ticket getTicket() {
        return null;
    }

    public void payForTicket(Ticket ticket) {

    }
}
