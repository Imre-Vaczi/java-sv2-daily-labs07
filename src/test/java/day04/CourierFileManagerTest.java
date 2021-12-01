package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {

    @Test
    void testCreateCourierByFileValid() {
        CourierFileManager cfm = new CourierFileManager();
        Courier courier = cfm.createCourierByFile(Paths.get("src/main/resources/ridesdata.txt"));

        assertEquals(6, courier.getRides().size());
        assertEquals(12, courier.getRides().get(0).getDistance());
        assertEquals(4, courier.getRides().get(5).getDayOfWeek());
    }

    @Test
    void testCreateCourierByFileInvalidFilePath() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new CourierFileManager().createCourierByFile(Paths.get("src/main/resources/rides.txt")));
        assertEquals("File can not be read.", exception.getMessage());
    }

}