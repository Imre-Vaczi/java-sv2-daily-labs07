package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RideTest {

    @Test
    void testGenerating() {
        Ride ride = new Ride(1,3,20);
        ride.setDayOfWeek(2);
        ride.setNumOfRide(4);
        ride.setDistance(21);

        assertEquals(2, ride.getDayOfWeek());
        assertEquals(4, ride.getNumOfRide());
        assertEquals(21, ride.getDistance());
    }

}