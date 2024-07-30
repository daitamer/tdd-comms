package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeanValueTest {

    MeanValue meanValue;
    int[] input;
    int[] input2;
    int[] input3;

    @BeforeEach
    void setUp(){
        meanValue = new MeanValue();
    }

    @Test
    @DisplayName("return mean value from an array of numbers")
    void testMeanValue() {
//Arrange
        input = new int[]{5, 6, 3, 8};
        input2 = new int[]{5, 20, 56, 72};
        input3 = new int[]{29, 68, 19, 3};
//Act
        double result = meanValue.meanValue(input);
        double result2 = meanValue.meanValue(input2);
        double result3 = meanValue.meanValue(input3);
//Assert
        assertAll("return mean value from an array of numbers",
                () -> assertEquals(5.5, result),
                () -> assertEquals(38.25, result2),
                () -> assertEquals(29.75, result3)
        );
    }

    @Test
    @DisplayName("return mean value from an array of numbers with positive and negative values")
    void test2MeanValue() {
//Arrange
        input = new int[]{5, -6, 3, -8};
        input2 = new int[]{-5, 20, -56, 72};
        input3 = new int[]{29, -68, 19, -3};
//Act
        double result = meanValue.meanValue(input);
        double result2 = meanValue.meanValue(input2);
        double result3 = meanValue.meanValue(input3);
//Assert
        assertAll("return mean value from an array of numbers",
                () -> assertEquals(-1.5, result),
                () -> assertEquals(7.75, result2),
                () -> assertEquals(-5.75, result3)
        );
}

    @Test
    @DisplayName("return -1 if the array is empty")
    void test3MeanValue() {
//Arrange
        input = new int[]{};

//Act
        double result = meanValue.meanValue(input);

//Assert
        assertAll("return mean value from an array of numbers",
                () -> assertEquals(-1, result)
        );
    }

}