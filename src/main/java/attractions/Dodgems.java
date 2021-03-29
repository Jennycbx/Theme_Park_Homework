package attractions;

import behaviours.ITicketed;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 6;
    }

    public double priceFor(people.Visitor visitor) {
        if (visitor.age < 12) {
            return defaultPrice()/2;
        }
        return defaultPrice();
    }
}
