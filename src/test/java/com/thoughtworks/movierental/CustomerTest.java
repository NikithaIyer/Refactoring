package com.thoughtworks.movierental;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void testTextStatementMessageForChildrensMovieRental() {
        Customer customer = setupCustomer();

        String expectedOutput = "Rental Record for Smith\n" +
                "\tUp\t3.0\n" +
                "\tDown\t3.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points";

        String textStatement = customer.textStatement();

        assertEquals(expectedOutput, textStatement);
    }


    @Test
    public void testHtmlStatementForChildrensMovieRental() {
        Customer customer = setupCustomer();

        String expectedOutput = "<H1>Rental Record for <B>Smith</B></H1><BR>\n" +
                "Up:3.0<BR>\n" +
                "Down:3.0<BR>\n" +
                "You owe <B>6.0</B>\n" +
                "On this rental you earned <B>2</B> frequent renter points";

        String htmlStatement = customer.htmlStatement();

        assertEquals(expectedOutput, htmlStatement);
    }

    private Customer setupCustomer() {
        Customer customer = new Customer("Smith");
        Movie movie1 = new Movie("Up", 2);
        Rental rental1 = new Rental(movie1, 4);

        Movie movie2 = new Movie("Down", 2);
        Rental rental2 = new Rental(movie2, 4);

        customer.addRental(rental1);
        customer.addRental(rental2);
        return customer;
    }

}