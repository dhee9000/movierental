public class ChildrensMovie extends Movie {

    public ChildrensMovie(String title){
        super(title);
    }

    @Override
    public float calculateRentalCost(int daysRented) {
        int amount = 0;
        amount += daysRented > 3 ? (daysRented - 3) * 1.5 + 1.5 : 1.5;
        return amount;
    }
    
}
