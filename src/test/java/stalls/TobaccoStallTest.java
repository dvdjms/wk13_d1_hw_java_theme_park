package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 0);
        visitor1 = new Visitor(11, 112, 15.00);
        visitor2 = new Visitor(15, 200, 35.00);
        visitor3 = new Visitor(36, 112, 9.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canFindIsAllowedStatus() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
        assertEquals(true, tobaccoStall.isAllowedTo(visitor3));
    }
}
