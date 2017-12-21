package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }
    public Hippodrome(List<Horse> horses){
       this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (Iterator<Horse> i = getHorses().iterator(); i.hasNext();) {
            Horse item = i.next();
            item.move();
        }

    }

    public void print(){
        for (Iterator<Horse> i = getHorses().iterator(); i.hasNext();) {
            Horse item = i.next();
            item.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
            Horse winner = null;
            int dotsCount = 0;

            for (Horse horsesList: getHorses())
            {
                if ((int)horsesList.getDistance()>dotsCount)
                {
                    winner = horsesList;
                    dotsCount = (int)horsesList.getDistance();
                }
            }
            return winner;
    }

    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }



    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<Horse>());

        Horse first = new Horse("first", 3, 0);
        Horse second = new Horse("second", 3, 0);
        Horse third = new Horse("third", 3, 0);

        game.getHorses().add(first);
        game.getHorses().add(second);
        game.getHorses().add(third);

        game.run();
        game.printWinner();
    }
}
