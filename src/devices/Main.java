package devices;
import devices.*;

public class Main {

    public static void main(String[] args) {
       Car[] list = new Car[3];
       Lpg honda = new Lpg("Accord","Honda",2.0,"as3gsdg5",399.99,1998);
       Disel passat = new Disel("Passat","volkswagen",2.0,"fg25dfg",2000.0,1994);
       Electric bmw = new Electric("z1","BMW",1.0,"kngdslgnjlsdng1",50000.0,2019);
       list[0]= honda;
       list[1]=passat;
       list[2]=bmw;


       Human dawid = new Human("Dawid","Dziewulski",25,"male",100000.0,list,2);
       Human bartek = new Human("Bartek","Puzio",24,"Male",25000.0);

      System.out.println(dawid.getCar(0).getModel());
      System.out.println(bartek.getCar(0));
      System.out.println(dawid.obliczSume());
      System.out.println(dawid.getCar(2).getModel());
      dawid.setCash(250000.0);
      bartek.setCash(50.0);
      bmw.sell(dawid,bartek,2000.00,bmw);
      dawid.sortuj();
      System.out.println(dawid.getCar(0).getModel());
      System.out.println(dawid.getCar(1).getModel());



    }
}