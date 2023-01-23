package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7, 456);
        visitor1 = new Visitor(11, 112, 15.00);
        visitor2 = new Visitor(15, 200, 35.00);
        visitor3 = new Visitor(36, 112, 9.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(456, playground.getVisitCount());
    }

    @Test
    public void hasPrice() {
        assertEquals(4.5, playground.defaultPrice(), 0.001);
    }

    @Test
    public void canFindIsAllowedStatus() {
        assertEquals(true, playground.isAllowedTo(visitor1));
        assertEquals(true, playground.isAllowedTo(visitor2));
        assertEquals(false, playground.isAllowedTo(visitor3));
    }
}
