package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {
        
    }


    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static{
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
          //  thePlanet = s.equals(Planet.SUN) ? Sun.getInstance() : s.equals(Planet.EARTH) ? Earth.getInstance() : s.equals(Planet.MOON) ? Moon.getInstance():  null;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
