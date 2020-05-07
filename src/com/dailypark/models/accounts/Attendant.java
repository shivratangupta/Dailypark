package com.dailypark.models.accounts;

import com.dailypark.models.people.Person;

public class Attendant extends Account {
    public Attendant(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }
}
