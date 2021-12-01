package day04;

public class Ride {

    private int dayOfWeek;
    private int numOfRide;
    private int distance;

    public Ride(int dayOfWeek, int numOfRide, int distance) {
        this.dayOfWeek = dayOfWeek;
        this.numOfRide = numOfRide;
        this.distance = distance;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getNumOfRide() {
        return numOfRide;
    }

    public int getDistance() {
        return distance;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setNumOfRide(int numOfRide) {
        this.numOfRide = numOfRide;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
