package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread first = new TestThread();
        first.start();
        first.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread  {

    }
}