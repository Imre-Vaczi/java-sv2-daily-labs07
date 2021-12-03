package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product p) {
        if (p.getDate().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Incompatible date.");
        }
        productList.add(p);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void writeIntoFile(Path path, String month) {
        List<String> filteredList = filterList(month,productList);
        try {
            Files.write(path, filteredList);
        } catch (IOException ioException) {
            throw new IllegalArgumentException("File can not be written.");
        }
    }

    private List<String> filterList(String month, List<Product> listToBeFiltered) {
        List<String> result = new ArrayList<>();
        for (Product prod : listToBeFiltered) {
            if (prod.getDate().getMonth().toString().equals(month.toUpperCase())) {
                result.add(prod.toString());
            }
        }
        return result;
    }
}
