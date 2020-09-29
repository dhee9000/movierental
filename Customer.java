
/**
 * Customer.java
 *
 * Customer Object
 * 
 * <P> Stores rental information related to a customer. 
 * 
 */

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();
    int frequentRenterPoints;

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {

        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {

            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            // Add rental cost
            thisAmount += each.getRentalCost();
            // Add frequent renter points
            addFrequentRenterPoints(1);
            // Add bonus point
            addFrequentRenterPoints(each.getPointBonus());

            // show figures for this rental
            result += "\t" + each.getMovieTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

    /**
     * Adds specified number of frequent renter points to the customer.
     * @param newPoints (required) number of new points to add.
     */
    private void addFrequentRenterPoints(int newPoints) {
        this.frequentRenterPoints += newPoints;
    }

}