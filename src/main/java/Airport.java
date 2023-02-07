import java.util.ArrayList;

public class Airport {

    private ArrayList<Passenger> passengersInAirport;
    // private Passenger passenger;
    private ArrayList<Flight> allFlights;

    public Airport(){
        this.passengersInAirport = new ArrayList<>();
        this.allFlights = new ArrayList<>();

    }

    public void addNewFlight(Flight flight){
        allFlights.add(flight);
    }

    public void cancelFlight(Flight flight){
        allFlights.remove(flight);
    }

    public String getListOfFlights(){ return this.allFlights.toString();}


    public void checkInPassenger(Passenger passenger){
        passengersInAirport.add(passenger);
    }

    public String addPassengerToFlight(Passenger passenger, Flight flight){



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
