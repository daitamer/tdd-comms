package org.example;

public class CaesarCipher {
    /*converts a given String to a Caesar cipher known as ROT13.
        In ROT13, each letter is rotated to one 13 places beyond it in the alphabet
        (looping around from Z back to A, if necessary).
     */
    public static String encryptingCaesarCode(String input) {
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            //
            //get ascii code for each input
           input.charAt(i) = (char) ((int) input.charAt(i) + 13);
             }

        return input;
    }
}
