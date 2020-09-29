/**
 * Rental.java
 * 
 * Movie Rental Object
 * 
 * <P> Stores information about an instance of a movie rental.
 * 
 */

public class Rental {
    private Movie _movie;
    private int   _daysRented;
    
    /**
     * Constructor
     * @param movie (required) movie object associated with rental.
     * @param daysRented (required) number of days movie object was checked out for.
     */
    public Rental(Movie movie, int daysRented) {
        _movie      = movie;
        _daysRented = daysRented;
    }
    
    /**
     * Returns number of days the movie was rented for.
     * @return daysRented for this instance of Rental.
     */
    public int getDaysRented() {
        return _daysRented;
    }
    
     /**
      * Returns the Movie associated with the Rental.
      * @return Movie associated with this Rental.
      */
    public Movie getMovie() {
        return _movie;
    }

    /**
     * Returns the movie title associated with the Rental.
     * @return title of the movie associated with the rental.
     */
    public String getMovieTitle(){
        return this._movie.getTitle();
    }

    /**
     * Gets the rental cost associated this rental based on movie and days rented.
     * @return rental cost based on days and movie
     */
    public float getRentalCost(){
        return this._movie.calculateRentalCost(this._daysRented);
    }

    /**
     * Gets the point bonus on the movie based on daysRented
     * @return the point bonus based on daysRented
     */
    public int getPointBonus(){
        return this._movie.calculatePointBonus(this._daysRented);
    }
}