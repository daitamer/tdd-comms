package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsciiValuesTest {
//    AsciiValues asciiValues;
    String input;
    String input2;
    String input3;
    @BeforeEach
    void setUp() {
//        asciiValues = new AsciiValues();
    }

    @Test
    @DisplayName("return sum when given a string of letters and digits")
    void testSumAsciiValue() {
    //Arrange
        input = "Hello World";
        input2 = "Number 123";
        input3 = "Number@#$";
    //Act
        int result = AsciiValues.sumAsciiValue(input);
        int result2 = AsciiValues.sumAsciiValue(input2);
        int result3 = AsciiValues.sumAsciiValue(input3);
    //Assert
        assertAll("return sum when given a string of letters and digits",
                () -> assertEquals(1020, result),
                () -> assertEquals(767, result2),
                () -> assertEquals(-1, result3)
        );
    }
}