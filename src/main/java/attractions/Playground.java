package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    private String name;
    private int rating;
    private int visitCount;
    private double price;

    public Playground(String name, int rating, int visitCount) {
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

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() < 16 );
    }
}
