package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 5;
    private static int timeout = 3500;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(timeout);
        clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while (!Thread.interrupted()) {
                    while (countSeconds >= 1) {
                        System.out.print(countSeconds);
                        countSeconds--;
                        System.out.print(" ");
                        Thread.sleep(1000);
                    }
                    System.out.print("Марш!");
                    this.interrupt();
                }

            } catch (InterruptedException e) {
                System.out.print("Прервано!");
            }
        }
    }
}
