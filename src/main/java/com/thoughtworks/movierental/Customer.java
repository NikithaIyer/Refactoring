package com.thoughtworks.movierental;

import java.util.ArrayList;

class Customer {
    private String name;

    private ArrayList<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String textStatement() {
        return new TextStatement(name, rentals, totalAmount(), frequentRenterPoints()).print();
    }

    private int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.frequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    private double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.charge();
        }
        return totalAmount;
    }

    public String htmlStatement() {
        return new HTMLStatement(name, rentals, totalAmount(), frequentRenterPoints()).print();
    }
}

