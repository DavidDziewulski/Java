package devices;

import com.company.Human;

public class Phone extends Device {
    public String operationSystem;
    public Double screenSize;
    public Integer yearOfProduction;

    public Phone(String model, String producer, Integer yearOfProduction, Double screenSize){
        super(model,producer,yearOfProduction);
        this.screenSize = screenSize;
    }
    public String getOsVersion(){
        return "5.32.1";
    }
    public void turnOn() {
        System.out.println("Włączone");
    }
    public void sell(Human seller, Human buyer, Double price){
        if(seller.getPhone() == null){
            System.out.println("Niestety sprzedający nie ma telefonu");
        }
        else{
            if(buyer.getCash() >= price){
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
                seller.setPhone(null);
                buyer.setPhone(seller.getPhone());
                System.out.println("Kupujący kupił telefon");
            }
            else{
                System.out.println("Niestety nie masz tyle kasy");
            }
        }
    }
}
