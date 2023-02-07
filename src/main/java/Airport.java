import java.util.ArrayList;

public class Airport {

    private ArrayList<Passenger> passengersInAirport;

    public ArrayList<Flight> allFlights;

    public Airport() {
        this.passengersInAirport = new ArrayList<>();
        this.allFlights = new ArrayList<>();

    }

    public void addNewFlight(Flight flight) {
        allFlights.add(flight);
    }

    public void cancelFlight(Flight flight) {
        allFlights.remove(flight);
    }

    public void printDestinations() {
        for (int i = 0; i < allFlights.size(); i++) {
            System.out.println(allFlights.get(i).getDestination());
        }

    }

    public boolean destinationExists(String destination) {
        for (int i = 0; i < allFlights.size(); i++) {
            if (allFlights.get(i).getDestination().toLowerCase().equals(destination.toLowerCase())) {
                return true;
            }
        }
        return false;
    }


    public void checkInPassenger(Passenger passenger) {
        passengersInAirport.add(passenger);
    }

    public void bookFlight(Passenger passenger, String destination) {
        for (int i = 0; i < allFlights.size(); i++) {
            allFlights.get(i).addPassenger(passenger);
        }
    }

    public void cancelBooking(Passenger passenger, String Destination){
        for (int i = 0; i < allFlights.size(); i++) {
            allFlights.get(i).removePassenger(passenger);
        }
    }

}


