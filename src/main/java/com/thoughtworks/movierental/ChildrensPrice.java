package com.thoughtworks.movierental;

public class ChildrensPrice extends Price {

    @Override
    double charge(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }

    @Override
    int frequentRenterPoints(int daysRented) {
        return Movie.BASIC_POINTS;
    }
}
