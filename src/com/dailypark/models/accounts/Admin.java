package com.dailypark.models.accounts;

import com.dailypark.models.people.Person;

public class Admin extends Account {
    public Admin(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }
}
