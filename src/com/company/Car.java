package com.company;

public class Car {
    final public String model;
    final public String producer;
    final private String vin;
    final double value;
    public String motor;


    Car( String model, String producer, String motor,String vin, Double value){
        this.model = model;
        this.producer = producer;
        this.motor = motor;
        this.vin = vin;
        this.value = value;
    }
}
