package com.thoughtworks.movierental;

class Rental {
    Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double charge() {
        return movie.charge(daysRented);
    }

    public int frequentRenterPoints() {
        return movie.frequentRenterPoints(daysRented);
    }
}