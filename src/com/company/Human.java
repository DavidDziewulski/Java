package com.company;
import java.util.Date;
public class Human {
    String firstName;
    String lastName;
    String sex;
    Integer age;

    Phone mobilePhone;
    Car car;
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

}
