package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static
    {
        labels.put(10.0, "A");
        labels.put(9.0, "B");
        labels.put(8.0, "C");
        labels.put(7.0, "D");
        labels.put(6.0, "E");

    }


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
