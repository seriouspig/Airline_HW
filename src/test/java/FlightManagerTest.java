import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightManagerTest {

    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;

    private Plane plane1;
    private Plane plane2;
    private Plane plane3;

    private Flight flight1;
    private Flight flight2;

    private FlightManager flightManager1;

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

        flightManager1 = new FlightManager(flight1);
    }

    @Test
    public void canGetBaggageAllowance() {
        assertEquals(202, flightManager1.getBaggageAllowance());
    }

    @Test
    public void canGetWeightOfBaggageBooked() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        flight1.bookPassenger(passenger4);
        assertEquals(808, flightManager1.getWeightOfBaggageBooked());
    }

    @Test
    public void canGetRemainingBaggageWeight() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        flight1.bookPassenger(passenger4);
        assertEquals(79457, flightManager1.getRemainingBaggageWeight());
    }

    @Test
    public void canSortPassengersBySeat() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        flight1.bookPassenger(passenger4);
        flightManager1.sortPassengers(flight1);
        assertTrue(flight1.getPassengers().get(0).getAssignedSeat().getSeatNumber() <
                flight1.getPassengers().get(1).getAssignedSeat().getSeatNumber());
        assertTrue(flight1.getPassengers().get(1).getAssignedSeat().getSeatNumber() <
                flight1.getPassengers().get(2).getAssignedSeat().getSeatNumber());
        assertTrue(flight1.getPassengers().get(2).getAssignedSeat().getSeatNumber() <
                flight1.getPassengers().get(3).getAssignedSeat().getSeatNumber());
    }
}
