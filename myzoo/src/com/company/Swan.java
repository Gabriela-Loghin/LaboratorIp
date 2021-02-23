package com.company;

public class Swan extends Animals{
    public void eat() {
        System.out.println("The swan eat plants.");
    }

    public void sound() {
        System.out.println("The swan yawns.");
    }

    public void move() {
        System.out.println("The swan fly.");
    }

    public void color() {
        System.out.println("The swan is white.");
    }

    public int weight() {
        int var = 15;
        return var;
        //System.out.println("The swan weighs 15 kg.");
    }

    public void species() {
        System.out.println("The swan is part of the Anatidae species. ");
    }

    public void habitat() {
        System.out.println("The swan's habitat is the lacks.");
    }


}
