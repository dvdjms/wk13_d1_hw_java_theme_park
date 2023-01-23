package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 4);
        visitor1 = new Visitor(11, 112, 15.00);
        visitor2 = new Visitor(15, 220, 35.00);
        visitor3 = new Visitor(36, 112, 9.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(4, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.001);
    }

    @Test
    public void canGetPriceFor() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.001);
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.001);
        assertEquals(8.40, rollerCoaster.priceFor(visitor3), 0.001);
    }

    @Test
    public void canFindIsAllowedStatus() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }
}
