import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class FlightTest {

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
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING_777_300, flight1.getPlaneType());
    }

    @Test
    public void canChangePlane() {
        flight1.changePlane(plane2);
        assertEquals(PlaneType.AIRBUS_A380_800, flight1.getPlaneType());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("ED1234", flight1.getFlightNumber());
    }

    @Test
    public void canChangeFlightNumber() {
        flight1.changeFlightNumber("ED4321");
        assertEquals("ED4321", flight1.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("GLA", flight1.getDestination());
    }

    @Test
    public void canChangeDestination() {
        flight1.changeDestination("POZ");
        assertEquals("POZ", flight1.getDestination());
    }

    @Test
    public void canGetOrigin() {
        assertEquals("EDN",flight1.getOrigin());
    }

    @Test
    public void canChangeOrigin() {
        flight1.changeOrigin("WAW");
        assertEquals("WAW", flight1.getOrigin());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals(LocalTime.of(12,45), flight1.getDepartureTime());
    }

    @Test
    public void canChangeDepartureTime() {
        flight1.changeDepartureTime(LocalTime.of(13,30));
        assertEquals(LocalTime.of(13,30), flight1.getDepartureTime());
    }

    @Test
    public void canCheckNumberOfPassengers() {
        assertEquals(0, flight1.getPassengerCount());
    }

    @Test
    public void canBookPassenger() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(3, flight1.getPassengerCount());
    }

    @Test
    public void canGetAvailableSeats() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(393, flight1.getAvailableSeatsCount());
    }

    @Test
    public void canNotOverbookFlight() {
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        flight2.bookPassenger(passenger3);
        flight2.bookPassenger(passenger4);
        assertEquals(3, flight2.getPassengerCount());
    }



}
