import java.util.ArrayList;

public class Airport{

    private ArrayList<Passenger> passengersInAirport;
    // private Passenger passenger;
    private ArrayList<Flight> allFlights;

    public Airport(){
        this.passengersInAirport = new ArrayList<>();
        this.allFlights = new ArrayList<>();

    }

    public Flight getFlight(){
        for (int i = 0 ; i < allFlights.size() ; i++ ){
            return allFlights.get(i);
        }
    }

    public void addNewFlight(Flight flight){
        allFlights.add(flight);
    }

    public void cancelFlight(Flight flight){
        allFlights.remove(flight);
    }

    public void printDestinations(){
        for (int i = 0 ; i < allFlights.size() ; i++ ){
            System.out.println(allFlights.get(i).getDestination());
        }

    }

    public boolean destinationExists(String destination){
        for (int i = 0 ; i < allFlights.size() ; i++ ){
            if (allFlights.get(i).getDestination().toLowerCase() == destination.toLowerCase()){
                return true;
            }
        }
        return false;
    }


    public void checkInPassenger(Passenger passenger){
        passengersInAirport.add(passenger);
    }

    public void addPassengerToFlight(Passenger passenger, String destination){
        //based on destination find flight
        // + check in person to flight.
        //if destinationExists then add passenger to flight.
//        if(allFlights.contains(destination){
        for (int i = 0 ; i < allFlights.size() ; i++ ){
             allFlights.get(i).addPassenger(passenger);
        }

        }

        }




        // if passenger is checked in AND passenger is booked onto flight = true
        // add passenger to flight
        // return "passenger booked onto flight"
        // else if passenger is not booked onto flight
        // return "Please book flight"
        // else, passenger is not checked in
        // return "remember to check in before your flight"
    }



//    public String getFlightDestination(Flight flight){
//        return flight
//    }


}
