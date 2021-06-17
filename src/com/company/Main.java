package com.company;
import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        FarmAnimal dog = new FarmAnimal("wilczur",4);
        Pet cat = new Pet("dachowiec",15);
        cat.feed();
        cat.feed(10.0);
    }
}
