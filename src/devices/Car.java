package devices;

import com.company.Human;

public abstract class Car extends Device{
    final private String vin;
    final public double value;
    public Double motor;
    public Integer yearOfProduction;


    public Car(String model, String producer, Double motor, String vin, Double value, Integer yearOfProduction){
        super(producer,model,yearOfProduction);
        this.motor = motor;
        this.vin = vin;
        this.value = value;
    }


    public abstract void refuel();
    public String toString(){
        return "producer:"+ producer+"model:"+model+"vin:"+vin;
    }
    public void turnOn() {
        System.out.println("Włączone");
    }
    public void sell(Human seller, Human buyer, Double price){
        if(seller.getCar() == null){
            System.out.println("Niestety sprzedający nie ma samochodu");
        }
        else{
            System.out.println(buyer.getCash());
            if(buyer.getCash() >= price){
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
                seller.setCar(null);
                buyer.setCar(seller.getCar());
                System.out.println("Kupujący kupił samochod");
            }
            else{
                System.out.println("Niestety nie masz tyle kasy");
            }
        }
    }
}
