package com.example.exercise5;

public class Task4 {
    public static void main(String[] args){

        String str1 = " Hello";
        String str2 = " Vistula";
        String str3 = str1 + str2; // appears as " Hello Vistula".
        String str4 = str2 + str1; // appears as " Vistula Hello".

        System.out.println(str3.equals(str4));
        System.out.println(str4.equals(str3));
    }
}