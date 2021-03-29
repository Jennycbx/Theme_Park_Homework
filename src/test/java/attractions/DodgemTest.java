package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(11, 140, 10);
        visitor1 = new Visitor(20, 201, 40);
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
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(6, dodgems.defaultPrice(), 0.0);
    }

    @Test
    public void canHalvePriceForUnder12() {
        assertEquals(3, dodgems.priceFor(visitor), 0.0);
    }

    @Test
    public void willNotHalvePriceForOver12() {
        assertEquals(6, dodgems.priceFor(visitor1), 0.0);
    }
}
