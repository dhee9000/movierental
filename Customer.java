
/**
 * Customer.java
 *
 * Customer Object
 * 
 * <P> Stores rental information related to a customer. 
 * 
 */

import java.util.Vector;

public class Customer {

    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String generateStatement() {

        double totalCost = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";

        for(Rental rental : _rentals){

            double rentalCost = 0;

            // Add rental cost
            rentalCost += rental.getRentalCost();
            // Add frequent renter points and bonus points
            frequentRenterPoints = 1 + rental.getPointBonus();

            // show figures for this rental
            result += "\t" + rental.getMovieTitle() + "\t" + String.valueOf(rentalCost) + "\n";
            totalCost += rentalCost;

        }

        // add footer lines
        result += "Amount owed is " + totalCost + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

    public String generateXMLStatement(){
        
        float totalCost = 0;
        int frequentRenterPoints = 0;

        // Add doctype
        String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        result += "<statement>\n";
        result += "\t<name>" + this._name + "</name>";
        result += "\t<rentals>\n";
        for (Rental rental : _rentals) {
            totalCost += rental.getRentalCost();
            frequentRenterPoints += rental.getPointBonus() + 1;
            result += 
                "\t\t<rental>\n"+
                "\t\t\t<movie>" + rental.getMovieTitle() + "</movie>\n" +
                "\t\t\t<days>" + rental.getDaysRented() + "</days>\n" +
                "\t\t\t<cost>" + rental.getRentalCost() + "</cost>\n" +
                "\t\t</rental>\n";
        }
        result += "\t</rentals>\n";
        result += "\t<total>" + totalCost + "</total>\n";
        result += "\t<points>" + frequentRenterPoints + "</points>\n";
        result += "</statement>\n";
        return result;
    }

}