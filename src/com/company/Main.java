package com.company;
import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
//	    Animal dog = new Animal("canis familiaris");
//	    dog.name = "Szarik";
//
//        Phone iphone = new Phone("s11","Samsung",2008,6.2);
//
//
//        Phone s11 = new Phone("se","Iphone",2015,4.5);
//
//
//        Human dawid = new Human();
//        dawid.age = 25;
//        dawid.lastName = "Dziewulski";
//        dawid.firstName = "Dawid";
//        dawid.sex = "man";
//        dawid.mobilePhone = iphone;
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.feed();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//
//        Car audi = new Car("Sportback","Audi","Disel","wozd29so391",2000.00,2009);
//        dawid.setSalary(2001);
//        dawid.getSalary();
//        dawid.setCar(audi);
//        Car audi2 = new Car("Sportback","Audi","Disel","wozd29so391",2000.00,2009);
//        System.out.println(audi.model.equals(audi2.model));
//        System.out.println(audi.equals(audi2));
//        System.out.println(audi);
//        System.out.println(s11);
//        System.out.println(dawid);
//        System.out.println(dog);
//
//        audi2.turnOn();
//        s11.turnOn();
//        audi2.toString();
//        s11.toString();

    // 8.zad

        Animal pet = new Animal("canis familiaris");
        pet.name = "Szarik2";

        Phone iphone2 = new Phone("s11","Samsung",2008,6.2);


        Phone s112 = new Phone("se","Iphone",2015,4.5);
        Human dawid2 = new Human();
        dawid2.age = 25;
        dawid2.lastName = "Dziewulski";
        dawid2.firstName = "Dawid";
        dawid2.sex = "man";
        Human dawid3 = new Human();
        dawid3.age = 25;
        dawid3.lastName = "Dziewulski";
        dawid3.firstName = "Dawid";
        dawid3.sex = "man";
        dawid2.mobilePhone = iphone2;
        Car audi3 = new Car("Sportback","Audi","Disel","wozd29so391",200.00,2009);
        dawid2.setCash(2010.0);
        dawid2.setSalary(2020);
        dawid3.setCash(2010.0);
        dawid3.setSalary(2010);
        dawid2.setCar(audi3);
        audi3.sell(dawid3,dawid2,200.00);

        dawid2.setPet(pet);
        pet.sell(dawid2,dawid3,10.90);

        dawid2.setPhone(iphone2);
        iphone2.sell(dawid2,dawid3,99.00);
    }
}
