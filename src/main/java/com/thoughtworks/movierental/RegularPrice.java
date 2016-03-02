package com.thoughtworks.movierental;

public class RegularPrice extends Price {

    @Override
    double charge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }

    @Override
    int frequentRenterPoints(int daysRented) {
        return Movie.BASIC_POINTS;
    }
}
