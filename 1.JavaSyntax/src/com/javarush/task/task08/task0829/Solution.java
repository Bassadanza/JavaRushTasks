package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //map of town/family
        HashMap <String, String> towns = new HashMap <String, String>();
        while (true)
        {
            String town = reader.readLine();
            if (town.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;
            towns.put(town, family);
        }

        //read key (town) and display
        String townname = reader.readLine();
        String familySecondName = towns.get(townname);
        System.out.println(familySecondName);
    }
}
