public class Main {
    public static void main(String[] args) {
        Movie childrenMovie = new ChildrensMovie("Up");
        Movie regularMovie = new RegularMovie("Transformers");
        Movie newMovie = new NewMovie("Tenet");

        Rental firstRental = new Rental(childrenMovie, 9);
        Rental secondRental = new Rental(regularMovie, 46);
        Rental thirdRental = new Rental(newMovie, 3);

        Customer person = new Customer("Brad");

        person.addRental(firstRental);
        person.addRental(secondRental);
        person.addRental(thirdRental);

        System.out.println(person.generateStatement());
        System.out.println(person.generateXMLStatement());



    }
}