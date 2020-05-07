package com.dailypark.models.accounts;

import com.dailypark.models.people.Person;

public class Customer extends Account {
    public Customer(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }
}
