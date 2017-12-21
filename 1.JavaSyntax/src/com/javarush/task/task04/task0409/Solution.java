package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        boolean isExit = false;

        while (!isExit) {

            System.out.println("Ход команды 1");
            first = turn(first);
            System.out.println("Счёт " + first + " : " + second);
            System.out.println("Ход команды 2");
            second = turn(second);
            System.out.println("Счёт " + first + " : " + second);
        }
    }

    public static int turn(int score) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(reader.readLine());
            if (i == 0) {
                //isExit = true;
            }
            else {
                if (i > 0 && i <= 3) {
                    score += i;
                } else {
                    System.out.println("Введите число от 0 до 3");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return score;
    }
}