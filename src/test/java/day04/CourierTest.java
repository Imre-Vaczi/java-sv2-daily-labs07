package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    void testAddRideValid() {
        Courier courier = new Courier();
        courier.addRide(new Ride(1,1,1));
        courier.addRide(new Ride(1,2,10));

        assertEquals(2, courier.getRides().size());
    }

    @Test
    void testAddRideInvalidRide() {

        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new Courier()
                        .addRide(new Ride(1,1,1))
                        .addRide(new Ride(1,2,10))
                        .addRide(new Ride(1,1,10))
        );
        assertEquals("Chronology compromised, data can not be recorded.", exception.getMessage());
    }

    @Test
    void testAddRideInvalidDay() {

        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new Courier()
                        .addRide(new Ride(1,1,1))
                        .addRide(new Ride(2,1,10))
                        .addRide(new Ride(2,2,10))
                        .addRide(new Ride(1,3,10))
        );
        assertEquals("Chronology compromised, data can not be recorded.", exception.getMessage());
    }

}