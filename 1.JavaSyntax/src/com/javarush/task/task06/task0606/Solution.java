package com.javarush.task.task06.task0606;

import java.io.IOException;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while (a>0){
            int s = a%10;
            if (s%2==0){
                even++;
            }
            else {
                odd++;
            }
            a = a/10;
        }
        System.out.println("Even : "+even+" Odd: "+odd);
    }
}
