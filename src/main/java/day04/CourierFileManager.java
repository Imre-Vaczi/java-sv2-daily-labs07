package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CourierFileManager {

    public Courier createCourierByFile(Path path) {
        Courier result = new Courier();
        for (String rideString : readRides(path)) {
            result.addRide(new Ride(
                    Integer.parseInt(cutStringRide(rideString)[0]),
                    Integer.parseInt(cutStringRide(rideString)[1]),
                    Integer.parseInt(cutStringRide(rideString)[2])
            ));
        }
        return result;
    }

    private List<String> readRides(Path path) {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(Paths.get(""));
        } catch (IOException ioException) {
            throw new IllegalArgumentException("File can not be read.");
        }
        return result;
    }

    private String[] cutStringRide(String ridePerLine) {
        return ridePerLine.split(" ");
    }
}
