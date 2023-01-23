package attractions;

import people.Visitor;
import stalls.Stall;

public class Park extends Attraction {

    private String name;
    private int rating;
    private int visitCount;
    private final double price;

   Attraction attraction;

    public Park(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
        this.price = 4.5;
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

    public double getPrice() {
        return price;
    }


    public double defaultPrice() {
        return 0;
    }

    public double priceFor(Visitor visitor) {
        return 0;
    }
}
