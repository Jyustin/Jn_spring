package com.nighthawk.java_tests;

public class test {
    public static int changeInt(int n) {
        n = n += 10;
        return(n);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Main method before changeInt(n): n = " + n); // prints 5
        n = changeInt(n);
        System.out.println("Main method after changeInt(n): n = " + n); // prints 15
    }
}
