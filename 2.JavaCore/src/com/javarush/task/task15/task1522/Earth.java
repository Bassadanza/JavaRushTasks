package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Earth {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ints = new ArrayList<>(10);
        int count = 1, maxSeq = 1;
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < 10; i++) {
            ints.add(n);
            n = Integer.parseInt(br.readLine());
            if (n == ints.get(i-1)) {
                count++;
            } else if (maxSeq < count){
                maxSeq = count;
                count = 0;
            }
            // System.out.println("count =" + count + " maxSeq = " + maxSeq);
        }
        br.close();
        if (maxSeq < count) {
            maxSeq = count;
        }
        System.out.println(maxSeq);
    }
}

