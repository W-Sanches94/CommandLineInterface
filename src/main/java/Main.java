import java.util.Scanner;

public class Main {

    private static Scanner reader;
    public static void main(String[] args) {
        // create empty airport
        Airport airport = new Airport();
        Flight paris = new Flight("Paris",1);
        Flight london = new Flight("London",2);
        Flight madrid = new Flight("Madrid",3);
        Flight amsterdam = new Flight("Amsterdam",4);

        // generate list of flights
        airport.addNewFlight(paris);
        airport.addNewFlight(london);
        airport.addNewFlight(madrid);
        airport.addNewFlight(amsterdam);


        // prompt user for input
        System.out.println("Hello, please enter your name");
        reader = new Scanner(System.in);
        String passengerName = reader.nextLine();
        // randomID = randomID generator for setting ID to new passenger

        // create new passenger using input
        Passenger passenger1 = new Passenger(passengerName); // this will take randomID

        // check in new passenger
        airport.checkInPassenger(passenger1);

        // prompt user to enter destination
        boolean loop = true;
        System.out.println("Welcome " + passengerName + ", please enter your desired destination.");
        while (loop){
            try {
                String inputDestination = reader.nextLine();
                System.out.println();
                if(airport.destinationExists(inputDestination)) {
                    System.out.println("Great choice, we will book you onto the flight to " + inputDestination);
                    airport.bookFlight(passenger1,inputDestination);
                    loop = false;
                }
                else {
                    System.out.println("Sorry, that destination is not available, please select from the following:");
                    airport.printDestinations();
                }
            }
            catch(Exception e){
                System.out.println("Sorry, we could not proceed with your request. Please try again.");
                System.out.println(e);
                reader.nextLine();
            }
        }

        System.out.println("Your booking has been confirmed, how else may we be of assistance?");
        String cancel = "cancel";
        try {
            String cancelRequest = reader.nextLine();
            if(cancel.equals(cancelRequest)){
                System.out.println("Please confirm your destination.");
                String inputDest = reader.nextLine();
                System.out.println("Your booking has been cancelled.");
                airport.cancelBooking(passenger1,inputDest);
            }
        }
        catch (Exception exception){
            System.out.println("We cannot process your request");
            System.out.println(exception);
            reader.nextLine();
        }





    }

    /*sout("hello, please print name")
    Scanner in = new Scanner(System.in)
    String passengerName = in.nextLine()
    passenger1.setName(passengerName)
    + Random ID generator to setPassengerID
    checkInPassenger(passenger1,
     */

}
