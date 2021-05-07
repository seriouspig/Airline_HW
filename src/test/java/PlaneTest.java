import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane1;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.AIRBUS_A380_800);
    }

    @Test
    public void canGetPlaneName(){
        assertEquals(PlaneType.AIRBUS_A380_800, plane1.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(499, plane1.getTotalSeats());
    }

    @Test
    public void canGetPlaneWeight() {
        assertEquals(277145, plane1.getPlaneWeight());
    }
}
