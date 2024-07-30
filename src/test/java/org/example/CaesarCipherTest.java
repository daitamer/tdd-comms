package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    @DisplayName("return CaesarCipher when passed a string")
    void encryptingCaesarCode() {
        //Arrange
        String input = "northcoders";
        String input2 = "abegupbqref";
//        String input3 = "I'm sure glad nobody can read my secret ROT13 code.";

        //Act
        String result = CaesarCipher.encryptingCaesarCode(input);
        String result2 = CaesarCipher.encryptingCaesarCode(input2);
//       String result3 = CaesarCipher.encryptingCaesarCode(input3);

        //Assert
        assertAll("return CaesarCipher when passed a string",
                () -> assertEquals("abegupbqref", result),
                () -> assertEquals("northcoders", result2)
//                () -> assertEquals("V'z fher tynq abobql pna ernq zl frperg EBG13 pbqr.", result3)
        );
    }
}