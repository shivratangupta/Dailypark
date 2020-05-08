package com.dailypark.models.people;

import com.dailypark.models.Address;
import com.dailypark.models.DBObject;
import com.dailypark.models.accounts.Account;

public class Person extends DBObject {
    private String name;
    private Address address;
    private String phoneNumber;
    private final Account account;

    public Person(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account getAccount() {
        return account;
    }
}
