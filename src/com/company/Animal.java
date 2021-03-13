package com.company;

import java.io.File;

public class Animal {
    String name;
    private Double weight = 1.0;
    final public  String species;
    File pic;
    static final public Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    Animal(String species){
        this.species = species;

        switch (this.species){
            case "canis familiaris" : this.weight = 10.0;
            case "feline" : this.weight = 2.0;
            default: this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }
    void feed(){
        this.weight++;
        System.out.println("Thanks for food:)");
    }
    void takeForAWalk(){
        if(this.weight == 0.0){
            System.out.println(this.name + "Died");
        }else{
            this.weight--;
            System.out.println("Thanks for walk:)");
        }
    }
}
