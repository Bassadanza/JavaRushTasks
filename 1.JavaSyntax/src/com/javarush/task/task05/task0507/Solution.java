package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,sum=0;
        for (i=0;;i++){
            int a=Integer.parseInt(br.readLine());
            if (a==-1)break;
            sum+=a;
        }
        double b=sum/i+1;
        System.out.println(b);
    }
}

