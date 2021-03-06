package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 3);
        visitor = new Visitor(12, 140, 10);
        visitor1 = new Visitor(20, 150, 40);

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
    public void hasRating() {
        assertEquals("3/10", tobaccoStall.getRating());
    }

    @Test
    public void testIsAllowedTo() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void testIsNotAllowedTo() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }
}
