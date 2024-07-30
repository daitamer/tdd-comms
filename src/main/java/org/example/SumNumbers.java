package org.example;

import java.util.Arrays;

public class SumNumbers {

    public int sumNumbers(int[] input){
        /*
        sum all the numbers of a given array, except for the lowest and highest elements.
         */
        // int sum
        // sort the input
        // loop through input, add elements to sum if its not the first nor last
        int sum = 0;
        Arrays.sort(input);

        for (int i = 1; i < input.length - 1; i++) {
            sum+= input[i];
        }
        return sum;
    }

}
