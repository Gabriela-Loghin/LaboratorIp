package com.company;

public class Elephant extends Animals{

    public void eat() {
        System.out.println("The elephant eat plants.");
    }

    public void sound() {
        System.out.println("The elephant roars.");
    }

    public void move() {
        System.out.println("The elephant go.");
    }

    public void color() {
        System.out.println("The elephant is grey.");
    }

    public int  weight() {
        int var = 7000;
        return var;
        //System.out.println("The elephant weighs 7000kg.");
    }

    public void species() {
        System.out.println("The elephant is part of the Elephantidae species. ");
    }

    public void habitat() {
        System.out.println("The elephant's habitat is the african jungle");
    }
}
