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
        System.out.println(airport.getListOfFlights());

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
                if (airport.getListOfFlights().contains(inputDestination)){
                    System.out.println("Great choice, we will book you onto the flight to " + inputDestination);
                    // addPassengerToFlight

                }
            }
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
