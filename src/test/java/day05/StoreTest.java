package day05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @TempDir
    File temporaryFolder;

    @Test
    void testWriteIntoFile() throws IOException {
        Path path = temporaryFolder.toPath().resolve("filteredList.txt");
        Store store = new Store();
        LocalDate timeStamp = LocalDate.now();
        store.addProduct(new Product("eper", 130, LocalDate.of(2021,6,20)));
        store.addProduct(new Product("alma", 100, LocalDate.now()));
        store.addProduct(new Product("szilva", 120, LocalDate.now()));

        store.writeIntoFile(path,"december");

        List<String> soldProductWritten = Files.readAllLines(path);
        assertEquals(2, soldProductWritten.size());
        assertEquals("szilva;120;"+timeStamp,soldProductWritten.get(1).toString());
    }

}