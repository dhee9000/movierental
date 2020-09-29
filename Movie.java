/**
 * Movie.java
 * 
 * Movie Object
 * 
 * <P>Stores information about instances of movies.
 * 
 */

public class Movie {

    /**
     * enumerated data type for typeOfFilm
     */

    public enum typeOfFilm {
        REGULAR(0),
        NEW_RELEASE(1),
        CHILDRENS(2);

        private int value;
        private typeOfFilm(int value) {
        this.value = value;
      }

     /**
     * Constants for _priceCode
     */
/*
    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;
*/


    private String _title;
    private int    _priceCode;
    
    /**
     * Constructor
     * @param title (required) title of the movie.
     * @param priceCode (required) priceCode associated with the movie
     */
    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }
    
    /**
     * Returns price code associated with the movie.
     * @return priceCode associated with the movie.
     */
    public int getPriceCode() {
        return _priceCode;
    }
    
    /**
     * Sets the price code of a movie.
     * @param newPriceCode (required) the price code to be set on this movie.
     */
    public void setPriceCode(int newPriceCode) {
        _priceCode = newPriceCode;
    }
    
    /**
     * Returns the title of the movie
     * @return title of the movie.
     */
    public String getTitle() {
        return _title;
    }

    // total cost of film including days rented
    public double findCost(double costOfFilm, int daysRented, Movie mov) {
        
        double totalCost = costOfFilm * daysRented;
    	return totalCost;
    }
}