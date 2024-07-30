package org.example;

public class AsciiValues {
    public static int sumAsciiValue(String input) {
        int sum = 0;
        String trimmedInput = input.replace(" ", "");

        for (int i = 0; i < trimmedInput.length(); i++) {

            sum += (int) trimmedInput.charAt(i);
        }
        return sum;
    }
}

