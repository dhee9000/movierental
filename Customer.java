
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
        String rentalRecord = "Rental Record for " + getName() + "\n";

        for(Rental rental : _rentals){

            double rentalCost = 0;

            // Add rental cost
            rentalCost += rental.getRentalCost();
            // Add frequent renter points and bonus points
            frequentRenterPoints = 1 + rental.getPointBonus();

            // show figures for this rental
            rentalRecord += "\t" + rental.getMovieTitle() + "\t" + String.valueOf(rentalCost) + "\n";
            totalCost += rentalCost;

        }

        // add footer lines
        rentalRecord += "Amount owed is " + totalCost + "\n";
        rentalRecord += "You earned " + frequentRenterPoints + " frequent renter points";
        return rentalRecord;
    }

    public String generateXMLStatement(){
        
        float totalCost = 0;
        int frequentRenterPoints = 0;

        // Add doctype
        String rentalRecord = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        rentalRecord += "<statement>\n";
        rentalRecord += "\t<name>" + this._name + "</name>";
        rentalRecord += "\t<rentals>\n";
        for (Rental rental : _rentals) {
            totalCost += rental.getRentalCost();
            frequentRenterPoints += rental.getPointBonus() + 1;
            rentalRecord += 
                "\t\t<rental>\n"+
                "\t\t\t<movie>" + rental.getMovieTitle() + "</movie>\n" +
                "\t\t\t<days>" + rental.getDaysRented() + "</days>\n" +
                "\t\t\t<cost>" + rental.getRentalCost() + "</cost>\n" +
                "\t\t</rental>\n";
        }
        rentalRecord += "\t</rentals>\n";
        rentalRecord += "\t<total>" + totalCost + "</total>\n";
        rentalRecord += "\t<points>" + frequentRenterPoints + "</points>\n";
        rentalRecord += "</statement>\n";
        return rentalRecord;
    }

}