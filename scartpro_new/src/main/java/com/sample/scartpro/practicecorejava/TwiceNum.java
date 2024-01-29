package com.sample.scartpro.practicecorejava;
import java.util.HashMap;

public class TwiceNum {
    public static void main(String[] args) {
        int a[] = {2, 2, 4, 4, 4, 5, 5, 5, 6, 6,3};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
            System.out.println("Element: " + num + ", Updated Frequency: " + frequencyMap.get(num));
        }

        System.out.println("Double-repeated numbers in the array:");
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == 2)
                System.out.print(num + " ");
        }
    }
}
