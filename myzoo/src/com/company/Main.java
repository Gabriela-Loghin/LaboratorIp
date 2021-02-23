
        package com.company;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.Callable;


        public class Main {
    public static void main(String[] args){

        ArrayList<Animals> zoo = new ArrayList<Animals>();
        ArrayList<Tiger> tigers = new ArrayList<Tiger>();
        ArrayList<Rabbit> rabbits = new ArrayList<Rabbit>();
        ArrayList<Snake> snakes = new ArrayList<Snake>();
        ArrayList<Bear> bears = new ArrayList<Bear>();
        ArrayList<Swan> swans = new ArrayList<Swan>();
        ArrayList<Elephant> elephants= new ArrayList<Elephant>();
        ArrayList<Flamingo> flamingos  = new ArrayList<Flamingo>();
        Cladiri cladire1 =  new Cladiri();
        Cladiri cladire2 = new Cladiri();
        Cladiri cladire3 = new Cladiri();


        Tiger t = new Tiger();
        Swan s = new Swan();
        Elephant e = new Elephant();
        Flamingo f = new Flamingo();
        Rabbit r = new Rabbit();
        Bear b = new Bear();
        Snake s1 = new Snake();

        zoo.add(s);
        zoo.add(e);
        zoo.add(f);
        zoo.add(r);
        zoo.add(b);
        zoo.add(s1);
        zoo.add(t);

        tigers.add(t);
        rabbits.add(r);
        snakes.add(s1);
        bears.add(b);
        swans.add((s));
        elephants.add(e);
        flamingos.add(f);

        for(Animals a: zoo){
            a.eat();
            a.sound();
            a.move();
            a.color();
            System.out.println("The weight of this animal is " + a.weight() + ".");
            a.species();
            a.habitat();
            System.out.println();

            if(a.weight() <= 100) {
                cladire1.addAnimals(a);
            }
            if(a.weight() < 300 && a.weight()>100){
                cladire2.addAnimals(a);
            }
            if(a.weight() >=300){
                cladire3.addAnimals(a);
            }

        }
        System.out.println("Number of animals is: "+zoo.size());
        System.out.println("Animalele din prima cladire :" + cladire1.listanimal().);
        System.out.println("Animalele din a doua cladire :" + cladire2.listanimal());
        System.out.println("Animalele din a treia  cladire :" + cladire3.listanimal());


        //Scanner in = new Scanner(System.in);


//        System.out.println("Check a category of animals or exit: ");
//        String option = in.nextLine();
//        switch (option) {
//            case "tiger":
//                System.out.println("Number of tigers is: " + tigers.size());
//            case "rabbit":
//                System.out.println("Number of rabbits is: " + rabbits.size());
//            case "snake":
//                System.out.println("Number of snakes is: " + snakes.size());
//            case "bear":
//                System.out.println("Number of bears is: " + bears.size());
//            case "swan":
//                System.out.println("Number of swans is: " + swans.size());
//            case "exit":
//                System.out.println("Exiting...");
//                break;
//            default:
//                System.out.println("No match.");
//        }

    }

}