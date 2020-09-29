/**
 * Movie.java
 * 
 * Movie Object
 * 
 * <P>Stores information about instances of movies.
 * 
 */

public abstract class Movie {
    
    private String _title;
    
    /**
     * Constructor
     * @param title (required) title of the movie.
     */
    public Movie(String title) {
        _title = title;
    }
    
    /**
     * Returns the title of the movie
     * @return title of the movie.
     */
    public String getTitle() {
        return _title;
    }

    /**
     * Calculates rental cost based on daysRented
     * @param daysRented (required) number of days the movie was rented.
     * @return rental cost based on daysRented
     */
    public abstract float calculateRentalCost(int daysRented);

    /**
     * Calculates point bonus to be awarded based on daysRented
     * @param daysRented (required) number of days the movie was rented.
     * @return point bonus based on daysRented
     */
    public int calculatePointBonus(int daysRented){
        return 0;
    }
}