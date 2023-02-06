import java.util.ArrayList;

public class Flight {

    private String destination;
    private int flightID;
    private ArrayList<Passenger> passenger;

    public Flight(String destination, int flightID) {
        this.destination = destination;
        this.flightID = flightID;
        ArrayList<Passenger> passenger = new ArrayList<>();
    }

    public ArrayList<Passenger> getPassenger() {
        return passenger;
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
