package devices;

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
}
