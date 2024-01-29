package com.sample.scartpro.practicecorejava;
import java.util.Scanner;
public class MaxEvenNum {
    //Input: num = [12,345,2,6,7896]
    //2
    public static int maxEvenNum(int[] num){

        int countEvenDigits = 0;
        for (int n : num) {
            int numDigits = 0;
            while (n != 0) {
                numDigits++;
                n /= 10;
            }
            if (numDigits % 2 == 0) {
                countEvenDigits++;
            }
        }
        return countEvenDigits;

    }

    public static void main(String[] args) {
      int[]  num = {12,345,2,6,7896,32,5678};
      int res1 = MaxEvenNum.maxEvenNum(num);
        System.out.println(res1);
    }
}
