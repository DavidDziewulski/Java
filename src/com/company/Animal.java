package com.company;

import java.io.File;

public class Animal {
    String name;
    private Double weight = 1.0;
    final  String species = "Canis";
    File pic;

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
