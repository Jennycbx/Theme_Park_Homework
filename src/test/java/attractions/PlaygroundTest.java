package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(12, 140, 10);
        visitor1 = new Visitor(16, 160, 30);
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
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void testIsAllowedTo() {
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void testIsNotAllowedTo() {
        assertEquals(false, playground.isAllowedTo(visitor1));
    }
}
