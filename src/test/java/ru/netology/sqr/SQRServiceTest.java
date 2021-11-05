package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'Standart bounds', 200, 300, 3",
                        "'All squares in bounds', 100, 9801, 90",
                        "'Squares more than upper bounds', 0, 99, 0",
                        "'Squares less than low bound', 9802, 10000, 0",
                        "'Bounds equal to the lowest square', 100, 100, 1",
                        "'Bounds equal to the highest square', 9801, 9801, 1",
                        "'Upper bounds less than low bound', 700, 100, 0"
    })
    void checkDoubles(String testName, int lowBound, int upperBound, int expected) {
        SQRService service = new SQRService();
        int actual = service.countNumberOfBounds(lowBound, upperBound);
        assertEquals(expected, actual);
    }

}