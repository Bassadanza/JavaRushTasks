package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        boolean isExit = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!isExit) {
            String s = reader.readLine();

            if (s.equals("exit")) {
                isExit = true;
            } else {
                try {
                    if (s.contains(".")) {
                        print(Double.parseDouble(s));
                    } else {
                        int a = Integer.parseInt(s);
                        if ((a > 0) && (a < 128)) {
                            print(Short.parseShort(s));
                        } else {
                            if ((a <= 0) || (a >= 128)) {
                                print(Integer.parseInt(s));
                            } else {
                                print(s);
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    print(s);
                }
            }


        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
