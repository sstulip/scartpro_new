package com.sample.scartpro.practicecorejava;
import java.util.ArrayList;
import java.util.List;

public class SampleSub {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(111);

        list.add(222);

        list.add(333);

        list.add(444);

        list.add(555);

        list.add(666);

        System.out.println(list);     //Output : [111, 222, 333, 444, 555, 666]

        //Retrieving a SubList

        List<Integer> subList = list.subList(1, 4);

        System.out.println(subList);

        String s = "what are you doing?";
        String res = s.replaceAll("\\s","");
        System.out.println(res);
    }
}