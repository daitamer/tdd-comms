package org.example;

public class MeanValue {

//    Using Test-Driven Development, create a class
//    which has a method to calculate the mean value
//    of an array of numbers.
//
//    Reminder: the mean average is the sum of
//    all the values divided by the number of values.

//    iterate through the input array of ints;
//    sum all ints;
//    devide the sum by array length;

    double meanValue(int[] input){

        if (input.length == 0){
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < input.length; i++){
            sum += input[i];
        }

        return (double)sum/input.length;
    }

}
