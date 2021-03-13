package com.company;

public class Car {
    final public String model;
    final public String producer;
    final private String vin;
    public String motor;


    Car( String model, String producer, String motor,String vin){
        this.model = model;
        this.producer = producer;
        this.motor = motor;
        this.vin = vin;
    }
}
