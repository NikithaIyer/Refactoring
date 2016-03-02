package com.thoughtworks.movierental;

public abstract class Price {

    abstract double charge(int daysRented);

    abstract int frequentRenterPoints(int daysRented);

}
