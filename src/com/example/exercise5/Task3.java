package com.example.exercise5;

public class Task3 {
    public static void main(String[] args){
        int n = 10, i, j, sum = 0;
        int matrix[][] = new int[n][n];

        for(i = 0; i < matrix.length; i++){
            for(j = 0; j < matrix.length; j++){
                if (i == j){
                    matrix[i][j] = i;
                    sum += matrix[i][j];
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The sum is the elements in the matrix is: " + sum);
    }
}