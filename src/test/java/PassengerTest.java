import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;

    private Plane plane1;
    private Plane plane2;
    private Plane plane3;

    private Flight flight1;
    private Flight flight2;


    @Before
    public void before() {
        passenger1 = new Passenger("Piotr Gryko", 2);
        passenger2 = new Passenger("Catalina Ramos Caballero", 1);
        passenger3 = new Passenger("Tomasz Gryko", 0);
        passenger4 = new Passenger("Bartosz Perepeczo", 1);

        plane1 = new Plane(PlaneType.BOEING_777_300);
        plane2 = new Plane(PlaneType.AIRBUS_A380_800);
        plane3 = new Plane(PlaneType.CESSNA_172);

        flight1 = new Flight(plane1, "ED1234", "GLA", "EDN", LocalTime.of(12,45));
        flight2 = new Flight(plane3, "ED3245", "ABD", "EDN", LocalTime.of(11,15));

    }

    @Test
    public void canGetname() {
        assertEquals("Piotr Gryko", passenger1.getName());
    }

    @Test
    public void canChangeName() {
        passenger1.changeName("Tomasz Gryko");
        assertEquals("Tomasz Gryko", passenger1.getName());
    }

    @Test
    public void canGetBagsCount() {
        assertEquals(2, passenger1.getBagsCount());
    }

    @Test
    public void canChangeNumberOfBags() {
        passenger1.changeBagsCount(1);
        assertEquals(1, passenger1.getBagsCount());
    }

    @Test
    public void canGetBookedFlight() {
        flight1.bookPassenger(passenger1);
        assertEquals(flight1, passenger1.getFlight());
    }

    @Test
    public void canGetRandomSeatNumber() {
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        assertEquals(1,flight2.getAvailableSeatsCount());
    }

}
