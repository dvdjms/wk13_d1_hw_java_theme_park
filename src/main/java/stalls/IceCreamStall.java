package stalls;

import jdk.nashorn.internal.ir.FunctionNode;

public class IceCreamStall extends Stall {

    Stall stall;

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public String getName() {
        return this.getStallName();
    }

    public int getRating() {
        return this.getStallRating();
    }
}
