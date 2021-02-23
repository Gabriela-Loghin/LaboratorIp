package com.company;

public class Rabbit extends Animals {

    public void eat() {
        System.out.println("The rabit eat carots.");
    }

    public void sound() {
        System.out.println("The rabit chasing.");
    }

    public void move() {
        System.out.println("The rabit jumsp.");
    }

    public void color() {
        System.out.println("The rabbit is white.");
    }

    public int weight() {
        int var = 2;
        return var;
        //System.out.println("The rabbit weighs 2 kg.");
    }

    public void species() {
        System.out.println("The rabit is part of the Leporidae species. ");
    }

    public void habitat() {
        System.out.println("The rabbit's habitat is the plain.");
    }

}
