package com.company;
import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.Date;
public class Human {
    String firstName;
    String lastName;
    String sex;
    Integer age;
    Double cash;
    Phone mobilePhone;
    private Car car;
    Animal pet;
    private Double salary;


    public double getSalary() {
        Date date = new Date();
        System.out.println(date );
        System.out.println(this.salary + "$" );
        return this.salary;
    }
    public void setSalary(double num) {
        if(num < 0.0){
            System.out.println("Chcesz zarabiać mniej niż 0$?");
        }else{
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Odbierz aneks do umowy od pani Hani");
            System.out.println("Zus i Us już wiedzą o zmianie wypłaty");
            this.salary = num;
        }
    }
    public Car getCar() {
        return this.car;
    }
    public void setCar(Car newCar) {
        if(this.salary > newCar.value){
            System.out.println("Udało kupić się samochód za gotówkę");
            this.car = newCar;
        }else if(this.salary > newCar.value/12){
            System.out.println("udało się kupić na kredyt (no trudno)");
            this.car = newCar;
        }else{
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }
    public String toString(){//overriding the toString() method
        return "firstName:"+firstName+"lastName:"+lastName+"sex:"+sex;
    }
    public Animal getPet() {
        return pet;
    }
    public void setPet(Animal pet) {
        this.pet = pet;
    }
    public Double getCash() {
        return cash;
    }
    public void setCash(Double cash) {
        this.cash = cash;
    }
    public Phone getPhone() {
        return mobilePhone;
    }

    public void setPhone(Phone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

}
