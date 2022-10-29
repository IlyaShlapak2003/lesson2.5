import transport.Auto;
import transport.Bus;
import transport.Train;
import transport.Transport;

import javax.swing.plaf.basic.BasicButtonUI;
import java.security.Key;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Auto car1 = new Auto("Lada",
                "Granta",
                "жёлтый",
                2015,
                "России",
                150, 1.5f,"автоматическая",
                "минивен",
                "н937хо61",
                7,
                "зимняя","бензин");
        car1.setKey(new Auto.key(false,true));
        car1.setInsurance();
        car1.information();
        car1.refill();
        System.out.println();


        Auto car2 = new Auto("Audi",
                "A8 50 L TDI quattro",
                "черный", 2020,
                "Германии",
                202,"дизель");
        car2.setKey(new Auto.key(false,false));
        car2.setInsurance(new Auto.insurance(LocalDate.now(),1254,"125463875"));
        car2.information();
        car2.refill();
        System.out.println();

        Auto car3 = new Auto("BMW",
                "Z8",
                "черный",
                2021,
                "Германии",259,3.0f,
                "автоматическая",
                "минивен",
                "н937хо61",
                7,
                "зимняя","электричество");
        car3.setKey(new Auto.key(true,true));
        car3.setInsurance(new Auto.insurance(LocalDate.now(),1254,"125463875"));
        car3.information();
        car3.refill();
        System.out.println();

        Auto car4 = new Auto("Kia",
                null,
                "красный",
                2018,
                "Южной Корее",180,
                2.4f,
                "механическая",
                "универсал",
                "н063хо40",
                4,
                "летняя","");
        car4.setKey(new Auto.key(false,true));
        car4.setInsurance(new Auto.insurance(LocalDate.now(),1254,"125463875"));
        car4.information();
        car4.refill();
        System.out.println();

        Auto car5 = new Auto("Hyundai",
                "Avante",
                "оранжевый",
                2016,
                "Южной Корее",189,0,
                "автоматическая",
                "внедорожник",
                "н987хо41",
                7,
                "зимняя","дизель");
        car5.setKey(new Auto.key(true,false));
        car5.setInsurance(new Auto.insurance(LocalDate.now(),1254,"125463875"));
        car5.information();
        car5.refill();
        System.out.println();

        Train train1 = new Train(
                "Ласточка", "B-901",null,2011,"Россия", 301, 3500f,0f,"Белоруссий вокзал","Минск-Пассажирский",  11);
        train1.information();
        train1.refill();
        System.out.println();

        Train train2=new Train("Ласточка","D-125",null,2011,"Россия",270,1700f,0,"Ленинградский вокзал","Ленинград-пассажирский",8);
        train2.information();
        train2.refill();
        System.out.println();

        Bus bus1=new Bus("Ford","Transit","черный",2018,"USA",150,"маршрутное такси", 25,"р062ое40","дизель");
        bus1.information();
        bus1.refill();
        System.out.println();

        Bus bus2=new Bus("ГАЗ","ГАЗель 3221", "желтый",2006,"Россия",130,null,14,"м548на35","бензин");
        bus2.information();
        bus2.refill();
        System.out.println();

        Bus bus3=new Bus("ПАЗ","32053","зеленый",2020,"Россия",110,"военный",24,null,"");
        bus3.information();
        bus3.refill();
        System.out.println();
    }
}
