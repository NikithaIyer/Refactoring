package com.thoughtworks.movierental;

import java.util.ArrayList;

public class HTMLStatement {
    private final String name;
    private final ArrayList<Rental> rentals;
    private final double totalAmount;
    private final int frequentRenterPoints;

    public HTMLStatement(String name, ArrayList<Rental> rentals, double totalAmount, int frequentRenterPoints) {
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
        return rental.getMovie().getTitle() + ":" +
                String.valueOf(rental.movie.price.charge(rental.getDaysRented())) + "<BR>\n";
    }

    private String header() {
        return "<H1>Rental Record for <B>" + name + "</B></H1><BR>\n";
    }

    private String footer() {
        String result = "";
        result += "You owe <B>" + String.valueOf(totalAmount) + "</B>\n";
        result += "On this rental you earned <B>" + String.valueOf(frequentRenterPoints)
                + "</B> frequent renter points";
        return result;
    }
}
