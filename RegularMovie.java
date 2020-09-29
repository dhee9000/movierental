public class RegularMovie extends Movie {

    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public float calculateRentalCost(int daysRented) {
        int amount = 0;
        amount += daysRented > 2 ? (daysRented - 2) * 1.5 + 2 : 2;
        return amount;
    }

}
