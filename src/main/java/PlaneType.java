public enum PlaneType {

    BOEING_777_300(396, 160530),
    AIRBUS_A380_800(499,277145),
    ILYUSHIN_IL_96_300(263, 132400),
    CONCORDE(120, 78700),
    TUPOLEV_TU_154M(180, 55300),
    CESSNA_172(3, 767);

    private int capacity;
    private int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }



}
