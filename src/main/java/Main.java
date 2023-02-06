public class Main {
    public static void main(String[] args) {

        Airport airport = new Airport();
        // prompt user to enter name
        // generate user id??? = this will happen in passenger class (see comments)
        airport.checkInPassenger(new Passenger("Ed",123));

    }
}
