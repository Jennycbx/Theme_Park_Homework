package people;

import attractions.Attraction;
import org.w3c.dom.Attr;

import java.util.ArrayList;

public class Visitor {

    public int age;
    public double height;
    private double money;
    private ArrayList<Attraction> visitedAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList getAttractions() {
        return this.visitedAttractions;
    }

    public void addAttractionToList(Attraction attraction) {
        this.visitedAttractions.add(attraction);
    }
}
