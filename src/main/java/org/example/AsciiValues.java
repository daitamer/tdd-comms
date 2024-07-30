package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AsciiValues {
    public static int sumAsciiValue(String input) {
        int sum = 0;
        String regex = "^[a-zA-Z0-9]+$";
        String trimmedInput = input.replace(" ", "");

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(trimmedInput);

        if (!matcher.matches()) {
//            throw new IllegalArgumentException("Invalid Input!!");
            System.out.println(input);
            return -1;
        }


        for (int i = 0; i < trimmedInput.length(); i++) {

            sum += (int) trimmedInput.charAt(i);
        }
        return sum;
    }
}

