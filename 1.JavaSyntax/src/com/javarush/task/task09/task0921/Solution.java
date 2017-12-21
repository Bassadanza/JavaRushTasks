package com.javarush.task.task09.task0921;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = new ArrayList();
        try {
            while(true){
                nums.add(in.nextInt());
            }
        } catch (InputMismatchException e){
            for (int i = 0; i < nums.size(); i++) {
                System.out.println(nums.get(i));
            }
        }
    }
}