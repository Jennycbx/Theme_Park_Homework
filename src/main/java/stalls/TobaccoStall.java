package stalls;

import behaviours.ISecurity;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(people.Visitor visitor) {
        if (visitor.age < 18) {
            return false;
        }
        return true;
    }
}
