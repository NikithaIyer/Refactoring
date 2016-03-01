package com.thoughtworks.movierental;

public class ChildrenPrice extends Price {

    @Override
    double getCharge(int daysRented) {
        if (daysRented > 3) {
            return 1.5 + (daysRented - 3) * 1.5;
        }
        return 1.5;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
