package day05;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testGenerating() {
        LocalDate timeStamp = LocalDate.now();
        Product product = new Product("alma", 100, timeStamp);

        assertEquals("alma", product.getName());
        assertEquals(100, product.getPrice());
        assertEquals(timeStamp, product.getDate());
        assertEquals("alma;100;"+timeStamp, product.toString());
    }

}