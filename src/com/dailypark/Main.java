package com.dailypark;

import com.dailypark.models.Address;
import com.dailypark.models.people.Person;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to dailypark!");
        Address a = new Address.Builder()
                .country("India")
                .state("Madhya Pradesh")
                .zipCode("000000")
                .city("Bhopal")
                .streetAddress("Kalpana Nagar")
                .build();

        Person shiv = new Person.Builder("Shiv")
                .phoneNumber("xyz")
                .build();

        System.out.println(a);
        System.out.println(shiv);
    }
}
