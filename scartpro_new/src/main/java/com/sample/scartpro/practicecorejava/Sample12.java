package com.sample.scartpro.practicecorejava;
public class Sample12 {
    public static void main(String[] args) {
        int rowCount = 1;
        for(int i =9; i>0; i--) {
            for (int j =1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print("*"+" ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }
    }


