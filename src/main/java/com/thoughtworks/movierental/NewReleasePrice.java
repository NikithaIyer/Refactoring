package com.thoughtworks.movierental;

public class NewReleasePrice extends Price {

    @Override
    double charge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int frequentRenterPoints(int daysRented) {
        return daysRented > 1 ? Movie.BONUS_POINTS : Movie.BASIC_POINTS;
    }
}
