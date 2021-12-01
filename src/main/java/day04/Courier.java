package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return rides;
    }

    public Courier addRide(Ride ride) {
        if (!isDayValid(getLastDay(),ride.getDayOfWeek()) || !isDeliveryValid(getLastRide(), ride.getNumOfRide())) {
            throw new IllegalArgumentException("Chronology compromised, data can not be recorded.");
        }
        rides.add(ride);
        return this;
    }

    private boolean isDayValid(int recorded, int toBeRecorded) {
        return recorded <= toBeRecorded;
    }

    private boolean isDeliveryValid(int recorded, int toBeRecorded) {
        return recorded < toBeRecorded;
    }

    private int getLastDay() {
        int index = rides.size();
        if (index == 0) {
            return 0;
        } else {
            return rides.get(index-1).getDayOfWeek();
        }
    }

    private int getLastRide() {
        int index = rides.size();
        if (index == 0) {
            return 0;
        } else {
            return rides.get(index-1).getNumOfRide();
        }
    }

}
