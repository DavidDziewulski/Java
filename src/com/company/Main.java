package com.company;
import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       Phone iphone = new Phone("Se","Iphone",2020,5.6);
       iphone.installAnApp("react");
       iphone.installAnApp("react","8.9");
       iphone.installAnApp("react","8.9","www.adf.pl");
       ArrayList<String> list = new ArrayList<String>();
       list.add("good");
       list.add("notGood");
       iphone.installAnApp(list);

       Electric tesla = new Electric("S11","Tokyo",2.4,"kskvi1932mkfsd",1200.0,2009);
       Disel passat = new Disel("Passat","Germany",1.9,"kradziony",1000.0,1999);
       Lpg honda = new Lpg("civic","Japonia",2.0,"ks12nk0gmk15",5000.0,2001);

       tesla.refuel();
       passat.refuel();
       honda.refuel();
    }
}
