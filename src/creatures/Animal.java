package creatures;
import devices.Human;
import devices.Salleable;

import java.io.File;

public abstract class Animal implements Salleable,  Feedable {
    String name;
    private Double weight = 1.0;
    final public  String species;
    File pic;
    static final public Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    Animal(String species){
        this.species = species;

        switch (this.species){
            case "canis familiaris" : this.weight = 10.0;
            case "feline" : this.weight = 2.0;
            default: this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }
    public void sell(Human seller, Human buyer, Double price){
        if(seller.getPet() == null){
          System.out.println("Niestety sprzedający nie ma zwierzaka");
        }
        else{
            if(buyer.getCash() >= price){
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
                seller.setPet(null);
                buyer.setPet(seller.getPet());
                System.out.println("Kupujący kupił zwierzę");
            }
            else{
                System.out.println("Niestety nie masz tyle kasy");
            }
        }
    }
    public void feed(){
        this.weight++;
        System.out.println("Thanks for food:)");
    }
    public void feed(Double fooWeight){
        this.weight++;
        System.out.println("Thanks for food:)");
    }
    void takeForAWalk(){
        if(this.weight == 0.0){
            System.out.println(this.name + "Died");
        }else{
            this.weight--;
            System.out.println("Thanks for walk:)");
        }
    }
    public String toString(){//overriding the toString() method
        return "name:"+name+"weight:"+weight+"species:"+species;
    }


}
