package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String chet = "четное число";
        String nechet = "нечетное число";
        String plus = "положительное ";
        String minus = "отрицательное ";

        if (a==0){
            System.out.println("ноль");
        }
        else
        {
        if (a>0) {
            if (a%2==0){
                System.out.println(plus+chet);
            }
            else
                System.out.println(plus+nechet);
        }
        else {
            if (a%2==0){
                System.out.println(minus+chet);
            }
            else
                System.out.println(minus+nechet);
        }
    }
}}
