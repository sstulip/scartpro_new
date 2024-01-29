package com.sample.scartpro.practicecorejava;
import java.util.Scanner;

public class Sample11 {

    public static void pyramidNUms(){
        int rowCount = 1;
        for(int i =9; i>0; i--) {
            for (int j =1; j <= i; j++)
            {
                System.out.print(" ");
            }
            int alwaysPrintOne = 1;
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }
    public static void main(String[] args) {
    Sample11.pyramidNUms();
    }
}
