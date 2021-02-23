package com.company;

public class Bear extends Animals{
    public void eat(){
        System.out.println("Bear eats meat.");
    }
    public void sound(){
        System.out.println("Bear roars.");
    }
    public void move(){
        System.out.println("Bear go.");
    }
    public void color(){
        System.out.println("Bear's color is brown.");
    }
    public int weight(){
        int var = 300;
        return var;
        //System.out.println("The bear has 300kg.");
    }

    @Override
    public void species() {
        System.out.println("The bear is part of the ursidae species. ");
    }

    @Override
    public void habitat() {

        System.out.println("The bear habitat is forest." );
    }

}
