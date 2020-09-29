import javax.swing.text.DefaultStyledDocument.ElementSpec;

// New Movie class
public class NewMovie extends Movie {

    public NewMovie(String title){
        super(title);
    }

    @Override
    public float calculateRentalCost(int daysRented) {
        int amount = daysRented * 3;
        return amount;
    }

    @Override
    public int calculatePointBonus(int daysRented){
        return daysRented > 1 ? 1 : 0;
    }

}
