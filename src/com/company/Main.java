package com.company;
import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal("canis familiaris");
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

        Car audi = new Car("Sportback","Audi","Disel","wozd29so391",2000.00);
        dawid.setSalary(2001);
        dawid.getSalary();
        dawid.setCar(audi);
        Car audi2 = new Car("Sportback","Audi","Disel","wozd29so391",2000.00);
        System.out.println(audi.model.equals(audi2.model));
        System.out.println(audi.equals(audi2));
        System.out.println(audi);
        System.out.println(s11);
        System.out.println(dawid);
        System.out.println(dog);
    }
}
