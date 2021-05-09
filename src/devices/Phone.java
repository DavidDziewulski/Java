package devices;

public class Phone {
     public String producer;
     public String model;
    public String operationSystem;
    public Double screenSize;
    public String getOsVersion(){
        return "5.32.1";
    }
    public String toString(){//overriding the toString() method
        return "producer:"+ producer+"model:"+model;
    }
}
