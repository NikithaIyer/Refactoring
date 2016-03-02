package com.thoughtworks.movierental;

import java.util.ArrayList;

public class TextStatement {

    private final String name;
    private final ArrayList<Rental> rentals;
    private final double totalAmount;
    private final int frequentRenterPoints;

    public TextStatement(String name, ArrayList<Rental> rentals, double totalAmount, int frequentRenterPoints) {
        this.name = name;
        this.rentals = rentals;
        this.totalAmount = totalAmount;
        this.frequentRenterPoints = frequentRenterPoints;
    }

    public String print() {
        return header() + body() + footer();
    }

    private String body() {
        String result = "";
        for (Rental rental : rentals) {
            result += line(rental);
        }
        return result;
    }

    private String line(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" +
                String.valueOf(rental.movie.price.charge(rental.getDaysRented())) + "\n";
    }

    private String header() {
        return "Rental Record for " + name + "\n";
    }

    private String footer() {
        String result = "";
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                + " frequent renter points";
        return result;
    }

}
