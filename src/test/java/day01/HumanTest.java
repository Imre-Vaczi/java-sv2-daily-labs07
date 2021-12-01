package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testGeneratingValid() {
        Human human = new Human("aaa bbb", 110);
        assertEquals("aaa bbb", human.getName());
        assertEquals(110, human.getYearOfBirth());
    }

    @Test
    void testGeneratingInvalidName() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new Human("aaabbb", 100));
        assertEquals("Provided name is not adequate, first and second name required.", exception.getMessage());
    }

    @Test
    void testGeneratingInvalidAge() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new Human("aaa bbb", 121));
        assertEquals("Provided data is out of bound in terms of age.", exception.getMessage());
    }

}