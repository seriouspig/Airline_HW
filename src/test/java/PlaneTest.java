import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane1;
    private Plane plane2;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.AIRBUS_A380_800);
        plane2 = new Plane(PlaneType.CESSNA_172);
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

    @Test
    public void canAssignSeatNumbers() {
        assertEquals(0, plane2.getSeatNumbers().size());
        plane2.assignSeatNumbers();
        assertEquals(3, plane2.getSeatNumbers().size());
    }
}
