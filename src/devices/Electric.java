package devices;


public class Electric extends Car{
    public Electric(String model, String producer, Double motor, String vin, Double value, Integer yearOfProduction) {
        super(model, producer, motor,vin,value, yearOfProduction);
    }
    public void refuel(){
        System.out.println("Tankowanie!");
    }
}