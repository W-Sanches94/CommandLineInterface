import java.util.ArrayList;

public class Flight {

    private String destination;
    private int flightID;
    private ArrayList<Passenger> passengersOnFlight;

    public Flight(String destination, int flightID) {
        this.destination = destination;
        this.flightID = flightID;
        ArrayList<Passenger> passengersOnFLight = new ArrayList<>();
    }



    public ArrayList<Passenger> getPassengersOnFlight() {
        return passengersOnFlight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

}
