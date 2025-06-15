package edu.example.trip;

public class Place {

    private final int tripCost;
    private final String tripIntro;

    public Place(int tripCost, String tripIntro) {
        this.tripCost = tripCost;
        this.tripIntro = tripIntro;
    }

    public int getTripCost() {
        return tripCost;
    }

    public String getInformation() {
        return tripIntro;
    }
}
