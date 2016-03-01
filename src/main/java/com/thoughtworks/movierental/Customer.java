package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental rental) {
        _rentals.add(rental);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for " + getName() + "\n");
        for (Rental rental : _rentals) {
            result.append("\t" + rental.getMovie().getTitle() + "\t" +
                    String.valueOf(rental.charge()) + "\n");
        }

        //add footer lines result
        result.append("Amount owed is " + String.valueOf(totalAmount()) + "\n");
        result.append("You earned " + String.valueOf(frequentRenterPoints()) + " frequent renter points");
        return result.toString();
    }

    private double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : _rentals)
            totalAmount += rental.charge();
        return totalAmount;
    }

    private int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : _rentals)
            frequentRenterPoints += rental.frequentRenterPoints();
        return frequentRenterPoints;
    }
}

