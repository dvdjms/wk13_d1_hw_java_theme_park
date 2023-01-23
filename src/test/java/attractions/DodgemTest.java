package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        dodgems = new Dodgems("Bumper Cars", 5, 45);
        visitor1 = new Visitor(11, 112, 15.00);
        visitor2 = new Visitor(15, 200, 35.00);
        visitor3 = new Visitor(36, 112, 9.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(45, dodgems.getVisitCount());
    }

    @Test
    public void hasPrice() {
        assertEquals(4.5, dodgems.defaultPrice(), 0.001);
    }

    @Test
    public void canGetPriceFor() {
        assertEquals(2.25, dodgems.priceFor(visitor1), 0.001);
        assertEquals(4.50, dodgems.priceFor(visitor2), 0.001);
        assertEquals(4.50, dodgems.priceFor(visitor3), 0.001);
    }

}
