package com.sample.scartpro.practicecorejava;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinAndMax {
    static class Result {

        int minimum;
        int maximum;
    }
    static Result findMinimumAndMaximum(Integer input[]) {

        Result result = new  Result();
        result.minimum = Collections.min(Arrays.asList(input));
        result.maximum = Collections.max(Arrays.asList(input));

        return result;
    }
    public static void main(String[] args) {

        Integer [] a = {1,4,100,9,456};
        Result result = findMinimumAndMaximum(a);
        System.out.printf("Minimum value in an array is " + result.minimum +"\n");
        System.out.printf("Maximum value in an array is " + result.maximum);
    }
}
