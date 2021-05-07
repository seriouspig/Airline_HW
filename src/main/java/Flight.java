import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String number;
    private String destination;
    private String origin;
    private String departureTime;

    public Flight(Plane plane, String number, String destination, String origin, String departureTime) {
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.number = number;
        this.destination = destination;
        this.origin = origin;
        this.departureTime = departureTime;
    }

    public int getAvailableSeatsCount() {
        return (this.plane.getTotalSeats() - this.passengers.size());
    }

    public void bookPassenger(Passenger passenger) {
        if (getAvailableSeatsCount() > 0) {
            this.passengers.add(passenger);
        }
    }

    public PlaneType getPlaneType() {
        return this.plane.getPlaneType();
    }

    public void changePlane(Plane newPlane) {
        this.plane = newPlane;
    }

    public String getFlightNumber() {
        return this.number;
    }

    public void changeFlightNumber(String newNumber) {
        this.number = newNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public void changeDestination(String newDestination) {
        this.destination = newDestination;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void changeOrigin(String newOrigin) {
        this.origin = newOrigin;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void changeDepartureTime(String newDepartureTime) {
        this.departureTime = newDepartureTime;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }
}
