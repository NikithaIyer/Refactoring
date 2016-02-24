package com.thoughtworks.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void testRentalMessageForRegularMovieRental() {
        Customer customer = new Customer("Smith");
        Movie movie = new Movie("Titanic", 200);
        Rental rental1 = new Rental(movie, 4);
        customer.addRental(rental1);

        String expectedOutput = "Rental Record for Smith\n" +
                "\tTitanic\t0.0\n" +
                "Amount owed is 0.0\n" +
                "You earned 1 frequent renter points";

        String statement = customer.statement();

        assertEquals(expectedOutput, statement);
    }

}