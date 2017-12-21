package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> childrens0 = new ArrayList<Human>();
        Human children1 = new Human("children1", 1, false, childrens0);
        Human children2 = new Human("children2", 3, true, childrens0);
        Human children3 = new Human("children3", 2, true, childrens0);
        ArrayList<Human> childrens1 = new ArrayList<>();
        childrens1.add(children1);
        childrens1.add(children2);
        childrens1.add(children3);


        Human mother = new Human("mother", 32, false, childrens1);
        Human father = new Human ("father", 35,true, childrens1);
        ArrayList<Human> childrens2 = new ArrayList<>();
        ArrayList<Human> childrens3 = new ArrayList<>();
        childrens2.add(mother);
        childrens3.add(father);

        Human grandma1 = new Human("grandma1", 65, false, childrens2);
        Human grandpa1 = new Human("grandpa1", 68, true, childrens2);

        Human grandma2 = new Human("grandma2", 65, false, childrens3);
        Human grandpa2 = new Human("grandpa2", 68, true, childrens3);

        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandpa1.toString());
        System.out.println(grandma2.toString());
        System.out.println(grandpa2.toString());
    }

    public static class Human{
        //напишите тут ваш код
        String name;
        int age;
        boolean sex;
        ArrayList<Human> children;

        public Human(String name, int age, boolean sex, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
