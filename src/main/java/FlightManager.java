public class FlightManager {

    private Flight flight;
    private int baggageAllowance;
    private int baggageWeight;
    private int availableBaggageWeight;

    public FlightManager(Flight flight) {
        this.flight = flight;
        this.baggageAllowance = baggageAllowance;
        this.baggageWeight = baggageWeight;
        this.availableBaggageWeight = availableBaggageWeight;
    }

    public int getBaggageAllowance() {
        int weight = (this.flight.getPlaneType().getWeight());
        int capacity = (this.flight.getPlaneType().getCapacity());
        this.baggageAllowance = (int) Math.floor((double)weight/2/capacity);
        return this.baggageAllowance;
    }

    public int getWeightOfBaggageBooked() {
        return this.baggageWeight = (this.flight.getPassengerCount() * getBaggageAllowance());
    }

    public int getRemainingBaggageWeight() {
        return this.availableBaggageWeight = this.flight.getPlaneType().getWeight()/2 - getWeightOfBaggageBooked();
    }
}
