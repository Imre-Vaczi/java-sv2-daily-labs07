package day05;

import java.time.LocalDate;

public class Product {

    private String name;
    private int price;
    private LocalDate date;

    public Product(String name, int price, LocalDate date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return name + ';' + price + ";" + date;
    }
}
