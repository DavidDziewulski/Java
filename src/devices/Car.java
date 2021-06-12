package devices;

public class Car extends Device{
    final private String vin;
    final public double value;
    public String motor;
    public Integer yearOfProduction;


    public Car(String model, String producer, String motor, String vin, Double value,Integer yearOfProduction){
        super(producer,model,yearOfProduction);
        this.motor = motor;
        this.vin = vin;
        this.value = value;
    }
    public String toString(){
        return "producer:"+ producer+"model:"+model+"vin:"+vin;
    }
    public void turnOn() {
        System.out.println("Włączone");
    }
}
