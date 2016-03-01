package com.thoughtworks.movierental;

class Rental {
    Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double charge() {
        return _movie.charge(_daysRented);
    }

    public int frequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}