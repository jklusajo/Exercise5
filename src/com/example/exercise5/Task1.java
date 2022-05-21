package com.example.exercise5;

public class Task1 {
    public static void main(String[] args){
        int board[] = new int[10];

        for(int i = 0; i < board.length; i++){
            board[i] = board.length - i - 1;
        }
        System.out.println();
        for (int x: board){
            System.out.println("array[" + x + "] = " + board[x]);
        }
    }
}