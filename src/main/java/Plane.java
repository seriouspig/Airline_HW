import java.util.ArrayList;
import java.util.Collections;

public class Plane {

    private PlaneType planeType;
    private ArrayList<Seat> seats;

    public Plane (PlaneType planeType) {
        this.planeType = planeType;
        this.seats = new ArrayList<>();
    }

    public int getTotalSeats() {
        return this.planeType.getCapacity();
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getPlaneWeight() {
        return this.planeType.getWeight();
    }

    public void assignSeatNumbers() {
        for (int i = 0; i < getTotalSeats() ; i ++) {
          Seat currentSeat = new Seat(i+1);
            this.seats.add(currentSeat);
            Collections.shuffle(this.seats);
        }
    }

    public ArrayList<Seat> getSeatNumbers() {
        return this.seats;
    }

    public void assignSeatToPassenger(Passenger passenger) {
        Seat seatToAssign = this.seats.remove(0);
        passenger.assignSeat(seatToAssign);
    }



}
