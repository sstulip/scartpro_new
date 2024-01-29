package com.sample.scartpro.practicecorejava;
public class Palindrome {

    public static void palindrome(String str) {
        int len = str.length();

        String reverse = "";
        for (int i = len - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        boolean palindrome = true;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)!=reverse.charAt(i)){
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("Palindrome");
        }else
            System.out.println("Not a palindrome");
            }
    public static void main(String[] args) {
    Palindrome.palindrome("MUM");
    }
}
