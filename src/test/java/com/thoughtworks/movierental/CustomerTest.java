package com.thoughtworks.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void testRentalMessageForChildrensMovieRental() {
        Customer customer = new Customer("Smith");
        Movie movie1 = new Movie("Up", 2);
        Rental rental1 = new Rental(movie1, 4);

        Movie movie2 = new Movie("Down", 2);
        Rental rental2 = new Rental(movie2, 4);

        customer.addRental(rental1);
        customer.addRental(rental2);

        String expectedOutput = "Rental Record for Smith\n" +
                "\tUp\t3.0\n" +
                "\tDown\t3.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points";

        String statement = customer.statement();

        assertEquals(expectedOutput, statement);
    }

}