package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    private String name;
    private int rating;
    private int visitCount;
    private double price;

    public RollerCoaster(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
        this.price = 8.40;
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
        if (visitor.getHeight() > 200) {
            return this.defaultPrice() * 2;
        }
        return this.defaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getHeight() > 145) && (visitor.getAge() > 12);
    }


}
