package com.sample.scartpro.practicecorejava;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        /* String sentence = "how are you";
        char[] charArray = sentence.toCharArray();
        String withoutSpaces = "";
        for(int i =0; i<sentence.length(); i++){
            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
            {
                withoutSpaces = withoutSpaces + charArray[i];
            }
        }
        System.out.println(withoutSpaces);*/
        List<Integer> duplicateElements = new ArrayList<>();
        duplicateElements.add(2);
        duplicateElements.add(3);
        duplicateElements.add(2);
        duplicateElements.add(5);
        duplicateElements.add(1);
        System.out.println(duplicateElements);
      Map<Integer, Long> map = duplicateElements.stream().collect(Collectors.groupingBy(k-> k,Collectors.counting()));
//      System.out.println(map);

    }
}
