import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;

    @Before
    public void before() {
        passenger1 = new Passenger("Piotr Gryko", 2);
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

}
