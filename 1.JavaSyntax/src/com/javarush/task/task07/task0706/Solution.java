package com.javarush.task.task07.task0706;

import java.util.Scanner;/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mass = new int[15];
        int chet = 0, nechet = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = in.nextInt();
        }

        for (int i : mass) {
            if (i % 2 == 0 || i == 0) {
                chet += i;
            } else {
                nechet += i;
            }
        }
        System.out.println(chet + " " + nechet);
        if (chet > nechet) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
