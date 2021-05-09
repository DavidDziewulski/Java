package devices;

public class Car {
    final public String model;
    final public String producer;
    final private String vin;
    final public double value;
    public String motor;


    public Car(String model, String producer, String motor, String vin, Double value){
        this.model = model;
        this.producer = producer;
        this.motor = motor;
        this.vin = vin;
        this.value = value;
    }
    public String toString(){//overriding the toString() method
        return "producer:"+ producer+"model:"+model+"vin:"+vin;
    }
}
