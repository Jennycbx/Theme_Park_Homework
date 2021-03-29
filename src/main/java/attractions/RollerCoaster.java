package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(people.Visitor visitor) {
        if (visitor.age > 12 && visitor.height > 145) {
            return true;
        }
        return false;
    }

    public double defaultPrice() {
        return 4;
    }

    public double priceFor(people.Visitor visitor) {
        if (visitor.height > 200) {
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
