package com.thoughtworks.movierental;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int BONUS_POINTS = 2;
    public static final int BASIC_POINTS = 1;
    private String title;
    Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("incorrect price code");
        }
    }

    public double charge(int daysRented){
        return price.charge(daysRented);
    }

    public int frequentRenterPoints(int daysRented){
        return price.frequentRenterPoints(daysRented);
    }

    public String getTitle() {
        return title;
    }

}