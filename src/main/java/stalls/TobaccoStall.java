package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    Stall stall;
    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public String getName() {
        return this.getStallName();
    }

    public int getRating() {
        return this.getStallRating();
    }





    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }
}
