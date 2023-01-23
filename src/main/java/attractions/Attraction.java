package attractions;

import behaviours.IReviewed;

public abstract class Attraction implements IReviewed {
    private final String name;
    private final int rating;
    private final int visitCount;

    public Attraction(String name, int rating, int visitCount) {
        this.name = name;
        this.rating = rating;
        this.visitCount = visitCount;
    }
    public String getAttractionName() {
        return this.name;
    }

    public int getAttractionRating() {
        return this.rating;
    }

    public int getAttractionVisitCount() {
        return visitCount;
    }

}
