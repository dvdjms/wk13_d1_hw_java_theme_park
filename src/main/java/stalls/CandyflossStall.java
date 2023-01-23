package stalls;

public class CandyflossStall extends Stall {

    Stall stall;


    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public String getName() {
        return this.getStallName();
    }

    public int getRating() {
        return this.getStallRating();
    }
}
