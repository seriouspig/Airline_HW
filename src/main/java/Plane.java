public class Plane {

    private PlaneType planeType;

    public Plane (PlaneType planeType) {
        this.planeType = planeType;
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



}
