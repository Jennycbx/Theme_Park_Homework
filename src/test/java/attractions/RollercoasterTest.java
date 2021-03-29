package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(12, 140, 10);
        visitor1 = new Visitor(20, 201, 40);
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
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void testIsAllowedTo() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void testIsNotAllowedTo() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void canDoublePriceForOver200() {
        assertEquals(8, rollerCoaster.priceFor(visitor1), 0.0);
    }

    @Test
    public void willNotDoublePriceForUnder200() {
        assertEquals(4, rollerCoaster.priceFor(visitor), 0.0);
    }
}
