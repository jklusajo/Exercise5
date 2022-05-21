package com.example.exercise5;

import java.util.Random;

public class Task2 {
    public static void main(String[] args){

        int min = 100, max = 0;

        Random r = new Random();
        int digits[] = new int[10];

        for (int i = 0; i < digits.length; i++){
            digits[i] = Math.round(r.nextInt(100)+1);
            System.out.print(digits[i] + ", ");
            if (digits[i] < min) min = digits[i];
            if (digits[i] > max) max = digits[i];
        }
        System.out.println();
        System.out.println("Minimum value in the set is: " + min);
        System.out.println("Maximum value in the set is: " + max);
    }
}