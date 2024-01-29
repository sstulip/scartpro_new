package com.sample.scartpro.practicecorejava;
import java.util.HashMap;
import java.util.Map;
// return the maximum number of consecutive 1's in the array.
//output: 1, 1, 1
public class Sample10 {

    public static int result(int[] a) {
        int maxCount = 0;
        int currentCount = 0;
        for (int i : a) {
            if (i == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }

        }
        return maxCount;
    }

    public static void main(String[] args) {
            int[] a = {1, 1, 0, 1, 1, 1,1};
            int res = Sample10.result(a);
             System.out.println(res);
    }
}
