public class Passenger {

    private String name;
    private int bags;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
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
}
