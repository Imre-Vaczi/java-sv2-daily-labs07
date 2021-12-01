package day01;

public class Human {
    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        if (yearOfBirth > 120) {
            throw new IllegalArgumentException("Provided data is out of bound in terms of age.");
        }
        if (name.split(" ").length < 2) {
            throw new IllegalArgumentException("Provided name is not adequate, first and second name required.");
        }

        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
