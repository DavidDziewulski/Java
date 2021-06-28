package devices;

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
    public void sell(Human seller, Human buyer, Double price, Car auto){
        int i=0;
        int miejsceSeller=0;
        for(Car car:seller.getGarage()){
            if(!car.equals(auto)){
                miejsceSeller++;
            }
            i++;

        }
        if(i != 0){
            i=0;
            int miejsceBuyer=0;
            for(Car car: buyer.getGarage()){
                if(car == null){
                    miejsceBuyer++;
                }
                i++;

            }
            if(i != 0){
                if(buyer.getCash() >= price){
                    buyer.setCash(buyer.getCash()-price);
                    seller.setCash((seller.getCash()+price));
                    buyer.setCar(seller.getCar(miejsceSeller), miejsceBuyer);
                    seller.setCar(null,miejsceSeller);
                    System.out.println("Samochod Kupiony!");
                }
                else{
                    System.out.println("Kupujacy nie ma pieniędzy!");
                }
            }
            else{
                System.out.println("Brak miejsc w garazu u kupującego");
            }
        }
        else{
            System.out.println("Seller nie ma auta!!");
        }
    }
    public  Double getValue()
    {
        return  this.value;
    }
}
