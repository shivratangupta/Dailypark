package com.dailypark;

import com.dailypark.models.Address;

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

    }
}
