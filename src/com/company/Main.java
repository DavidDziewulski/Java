package com.company;

import javax.xml.crypto.dsig.keyinfo.PGPData;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal();
	    dog.name = "Szarik";

        Phone iphone = new Phone();
        iphone.producer = "apple";
        iphone.model = "6S";

        Phone s11 = new Phone();
        s11.producer = " Samsung";
        s11.model = "S11";

        Human dawid = new Human();
        dawid.age = 25;
        dawid.lastName = "Dziewulski";
        dawid.firstName = "Dawid";
        dawid.sex = "man";
        dawid.mobilePhone = iphone;
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
    }
}
