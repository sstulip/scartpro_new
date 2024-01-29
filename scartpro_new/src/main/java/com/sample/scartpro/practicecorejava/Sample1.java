package com.sample.scartpro.practicecorejava;
public class Sample1 {
    public static void main(String[] args) {
//        StringBuilder r1 = new StringBuilder("APPLE");
//        String res = String.valueOf(r1.reverse());
//        System.out.println(res);

//        String r = "BALL";
//        char[] strArr = r.toCharArray();
//        for(int i= strArr.length-1; i>=0; i--){
//            System.out.print(strArr[i]);
//        }
    String res = Sample1.recursiveMethod("Birds");
        System.out.println(res);

    }
    static String recursiveMethod(String str)
    {
        if ((null == str) || (str.length() <= 1))
        {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
