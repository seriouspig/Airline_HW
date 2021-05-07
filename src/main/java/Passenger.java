public class Passenger {

    private String name;
    private int bags;
    private Flight flight;
    private Seat seat;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.flight = null;
        this.seat = new Seat(0);

    }

    public String getName() {
        return this.name;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public int getBagsCount() {
        return this.bags;
    }

    public int changeBagsCount(int newBags) {
        return this.bags = newBags;
    }

    public void addFlight(Flight newFlight) {
        this.flight = newFlight;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public void assignSeat(Seat newSeat) {
        this.seat = newSeat;
    }

    public Seat getAssignedSeat() {
        return this.seat;
    }

    public int compareTo(Passenger passenger) {
        int res = 0;
        if (this.seat.getSeatNumber() < passenger.getAssignedSeat().getSeatNumber()) {
            res =- 1;
        }
        if (this.seat.getSeatNumber() > passenger.getAssignedSeat().getSeatNumber()) {
            res = 1;
        }
        return res;
    }


}
