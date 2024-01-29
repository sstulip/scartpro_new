package com.sample.scartpro.practicecorejava;
public class MaxOnes {
    //Input: num = [12,345,2,6,7896]
    //2
    public static int maxEvenNum(int[] num){

        int numDigits = 0;
        for (int n : num) {
            if (n == 1) {
                numDigits++;
            }
            else {
               numDigits=0;
            }
        }
        return numDigits;

    }

    public static void main(String[] args) {
      int[]  num = {1,1,0,1,1,1,0,1,1,1,1,1};
      int res1 = MaxOnes.maxEvenNum(num);
        System.out.println(res1);
    }
}
