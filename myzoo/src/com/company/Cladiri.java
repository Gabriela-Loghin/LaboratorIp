package com.company;

import java.util.ArrayList;

public class Cladiri {


    private ArrayList<Animals> animals = new ArrayList<>();

    public void addAnimals (Animals a){
        this.animals.add(a);
    }

    public void removeAnimals (Animals a){
        this.animals.remove(a);
    }
    public ArrayList listanimal (){
        return (ArrayList) this.animals.clone();

    }


}