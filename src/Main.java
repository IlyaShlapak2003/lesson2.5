import transport.Auto;
import transport.Bus;
import transport.Truck;


public class Main {
    public static void main(String[] args) {

        Auto car1 = new Auto("Lada",
                "Granta",
                1.5f);
        System.out.println(car1);
        System.out.println();
        car1.startMoving();
        System.out.println();
        car1.finishTheMove();
        System.out.println();


        Auto car2 = new Auto("Audi",
                "A8 50 L TDI quattro",
                2);
        System.out.println(car2);
        System.out.println();
        car2.startMoving();
        System.out.println();
        car2.finishTheMove();
        System.out.println();

        Auto car3 = new Auto("BMW",
                "Z8",
                3.0f);
        System.out.println(car3);
        System.out.println();
        car3.startMoving();
        System.out.println();
        car3.finishTheMove();
        System.out.println();

        Auto car4 = new Auto("Kia",
                "Rio",
                2.4f);
        System.out.println(car4);
        System.out.println();
        car4.startMoving();
        System.out.println();
        car4.finishTheMove();
        System.out.println();


        Bus bus1=new Bus("Ford","Transit",2);
        System.out.println(bus1);
        System.out.println();
        bus1.startMoving();
        System.out.println();
        bus1.finishTheMove();
        System.out.println();

        Bus bus2=new Bus("ГАЗ","ГАЗель 3221", 2.5f);
        System.out.println(bus2);
        System.out.println();
        bus2.startMoving();
        System.out.println();
        bus2.finishTheMove();
        System.out.println();

        Bus bus3=new Bus("ПАЗ","32053",4);
        System.out.println(bus3);
        System.out.println();
        bus3.startMoving();
        System.out.println();
        bus3.finishTheMove();
        System.out.println();

        Bus bus4=new Bus("ГАЗ","Соболь 2310", 2.5f);
        System.out.println(bus4);
        System.out.println();
        bus4.startMoving();
        System.out.println();
        bus4.finishTheMove();
        System.out.println();

        Truck truck1 = new Truck("КамАЗ","54901",12);
        System.out.println(truck1);
        System.out.println();
        truck1.startMoving();
        System.out.println();
        truck1.finishTheMove();
        System.out.println();

        Truck truck2 = new Truck("МАЗ","5440М9",13);
        System.out.println(truck2);
        System.out.println();
        truck2.startMoving();
        System.out.println();
        truck2.finishTheMove();
        System.out.println();

        Truck truck3 = new Truck("Scania","S730",8);
        System.out.println(truck3);
        System.out.println();
        truck3.startMoving();
        System.out.println();
        truck3.finishTheMove();
        System.out.println();

        Truck truck4 = new Truck("Volvo","FH16",16);
        System.out.println(truck4);
        System.out.println();
        truck4.startMoving();
        System.out.println();
        truck4.finishTheMove();
        System.out.println();
    }
}
