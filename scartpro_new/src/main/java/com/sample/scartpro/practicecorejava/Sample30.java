package com.sample.scartpro.practicecorejava;
public class Sample30 {
int age;
String name;
//    public Sample30(){
//        System.out.println("hello shiva");
//    }

    public Sample30(String name, int age){
        this.name = name;
        this.age = age;
    }
//
//    @Override
//    public String toString() {
//        return "Sample30{" + "age=" + age + ", name='" + name + '\'' + '}';
//    }

    public static void main(String[] args) {
        Sample30 obj = new Sample30("shiva",35);
        System.out.println(obj);
    }
}
