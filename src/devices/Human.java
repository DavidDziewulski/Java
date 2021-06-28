package devices;
import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.Arrays;
import java.util.Date;
public class Human {
    String firstName;
    String lastName;
    String sex;
    Integer age;
    Double cash;
    Phone mobilePhone;
    private Car[] garage;
    Animal pet;
    private Double salary;
    public Human(String firstName, String lastName, Integer age, String sex, Double salary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.sex=sex;
        this.salary=salary;
        this.garage = new Car[2];
    }
    public Human(String firstName, String lastName, Integer age, String sex, Double salary, Car[] list, Integer cars) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.sex=sex;
        this.salary=salary;
        this.garage = new Car[cars];
        this.garage = list;
    }

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
    public Car getCar(int miejsce) {
        return this.garage[miejsce];
    }
    public void setCar(Car newCar, int miejsce) {
      this.garage[miejsce] = newCar;
    }
    public Car[] getGarage(){return garage;}
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
    public Double obliczSume(){
        Double result = 0.0;
            for(Car auto:garage){
                result+=auto.getValue();
            }
        return result;
    }
    public void sortuj(){
        Arrays.sort(garage);
    }
}
