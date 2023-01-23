package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private String name;
    private int rating;
    private int visitCount;
    private final double price;
    private Visitor visitor;
    Attraction attraction;


    public Dodgems(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
        this.price = 4.50;
    }

    public String getName() {
        return this.getAttractionName();
    }

    public int getRating() {
        return this.getAttractionRating();
    }

    public int getVisitCount() {
        return this.getAttractionVisitCount();
    }

    public double defaultPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.defaultPrice() / 2;
        }
        return this.defaultPrice();
    }

}
