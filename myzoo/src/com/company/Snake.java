package com.company;

public class Snake extends Animals{
    public void eat(){
        System.out.println("Snack eats meat.");
    }
    public void sound(){
        System.out.println("The snake hissed.");
    }
    public void move(){
        System.out.println("The snake crawls.");
    }
    public void color(){
        System.out.println("The snake is multicolored.");
    }
    public int weight(){
        int var = 60;
        return var;
       // System.out.println("The snake weighs 60 kg.");
    }

    @Override
    public void species() {
        System.out.println("The snake is part of the Reptilia species .");
    }

    @Override
    public void habitat() {
        System.out.println("The snake habitat is jungle." );
    }
}
