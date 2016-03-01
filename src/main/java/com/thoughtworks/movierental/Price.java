package com.thoughtworks.movierental;

public abstract class Price {

    abstract double getCharge(int daysRented);

    public abstract int getFrequentRenterPoints(int daysRented);
}