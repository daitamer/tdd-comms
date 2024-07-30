package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class SumNumbersTest {

    SumNumbers sumNumbers;
    int[] input;
    int[] input2;
    int[] input3;

    @BeforeEach
    void setUp() {
        sumNumbers = new SumNumbers();
    }

    @Test
    @DisplayName("return 0 if int array is less than three digits long")
    void testSumNumbers() {

        input = new int[]{1, 2};
        input2 = new int[]{1};
        input3 = new int[]{};

        int result = sumNumbers.sumNumbers(input);
        int result2 = sumNumbers.sumNumbers(input2);
        int result3 = sumNumbers.sumNumbers(input3);

        assertEquals(0, result);
        assertEquals(0, result2);
        assertEquals(0, result3);

    }
    @Test
    @DisplayName("return sum excluding lowest and highest element in the int array")
    void test2SumNumbers() {
        //Arrange
        input = new int[]{1, 2, 3, 4, 5, 8, 11};
        input2 = new int[]{5, 2, 6, 10, 22 };
        //Act
        int result = sumNumbers.sumNumbers(input);
        int result2 = sumNumbers.sumNumbers(input2);
        //Assert
        assertEquals(22, result);
        assertEquals(21, result2);
    }
}