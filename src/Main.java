import Drive.Driver;
import transport.Auto;
import transport.Bus;
import transport.Truck;


public class Main {
    public static void main(String[] args) {

        Auto car1 = new Auto("Lada",
                "Granta",
                1.5f,3.10f,210);
        System.out.println(car1);
        System.out.println();
        car1.startMoving();
        System.out.println(car1.pitStop());
        car1.finishTheMove();
        System.out.println("Лучшее время " + car1.bestTime());
        System.out.println("Максимальная скорость " + car1.maxSpeed());
        System.out.println();
        Driver<Auto> nicola= new Driver<>("Васильев", "Николай", "Иванович",true, (byte) 5, car1);
        System.out.println(nicola);
        System.out.println();

        Auto car2 = new Auto("Audi",
                "A8 50 L TDI quattro",
                2,2.60f,250);
        System.out.println(car2);
        System.out.println();
        car2.startMoving();
        System.out.println(car2.pitStop());
        car2.finishTheMove();
        System.out.println("Лучшее время " + car2.bestTime());
        System.out.println("Максимальная скорость " + car2.maxSpeed());
        System.out.println();

        Auto car3 = new Auto("BMW",
                "Z8",
                3.0f,3.40f,180);
        System.out.println(car3);
        System.out.println();
        car3.startMoving();
        System.out.println(car3.pitStop());
        car3.finishTheMove();
        System.out.println("Лучшее время " + car3.bestTime());
        System.out.println("Максимальная скорость " + car3.maxSpeed());
        System.out.println();

        Auto car4 = new Auto("Kia",
                "Rio",
                2.4f,2.10f,310);
        System.out.println(car4);
        System.out.println();
        car4.startMoving();
        System.out.println(car4.pitStop());
        car4.finishTheMove();
        System.out.println("Лучшее время " + car4.bestTime());
        System.out.println("Максимальная скорость " + car4.maxSpeed());
        System.out.println();


        Bus bus1=new Bus("Ford","Transit",2, 3, 190);
        System.out.println(bus1);
        System.out.println();
        bus1.startMoving();
        System.out.println(bus1.pitStop());
        bus1.finishTheMove();
        System.out.println("Лучшее время " + bus1.bestTime());
        System.out.println("Максимальная скорость " + bus1.maxSpeed());
        System.out.println();
        Driver<Bus> ivan= new Driver<>("Пертов", "Иван", "Васильевич",true, (byte) 5, bus1);
        System.out.println(ivan);
        System.out.println();

        Bus bus2=new Bus("ГАЗ","ГАЗель 3221", 2.5f,5,160);
        System.out.println(bus2);
        System.out.println();
        bus2.startMoving();
        System.out.println(bus2.pitStop());
        bus2.finishTheMove();
        System.out.println("Лучшее время " + bus2.bestTime());
        System.out.println("Максимальная скорость " + bus2.maxSpeed());
        System.out.println();

        Bus bus3=new Bus("ПАЗ","32053",4,9,120);
        System.out.println(bus3);
        System.out.println();
        bus3.startMoving();
        System.out.println(bus3.pitStop());
        bus3.finishTheMove();
        System.out.println("Лучшее время " + bus3.bestTime());
        System.out.println("Максимальная скорость " + bus3.maxSpeed());
        System.out.println();

        Bus bus4=new Bus("ГАЗ","Соболь 2310", 2.5f,4,160);
        System.out.println(bus4);
        System.out.println();
        bus4.startMoving();
        System.out.println(bus4.pitStop());
        bus4.finishTheMove();
        System.out.println("Лучшее время " + bus4.bestTime());
        System.out.println("Максимальная скорость " + bus4.maxSpeed());
        System.out.println();

        Truck truck1 = new Truck("КамАЗ","54901",12,12,90);
        System.out.println(truck1);
        System.out.println();
        truck1.startMoving();
        System.out.println(truck1.pitStop());
        truck1.finishTheMove();
        System.out.println("Лучшее время " + truck1.bestTime());
        System.out.println("Максимальная скорость " + truck1.maxSpeed());
        System.out.println();
        Driver<Truck> danil= new Driver<>("Козлов", "Данил", "Сергеевич",true, (byte) 5, truck1);
        System.out.println(danil);
        System.out.println();

        Truck truck2 = new Truck("МАЗ","5440М9",13,11,100);
        System.out.println(truck2);
        System.out.println();
        truck2.startMoving();
        System.out.println(truck2.pitStop());
        truck2.finishTheMove();
        System.out.println("Лучшее время " + truck2.bestTime());
        System.out.println("Максимальная скорость " + truck2.maxSpeed());
        System.out.println();

        Truck truck3 = new Truck("Scania","S730",8,8,180);
        System.out.println(truck3);
        System.out.println();
        truck3.startMoving();
        System.out.println(truck3.pitStop());
        truck3.finishTheMove();
        System.out.println("Лучшее время " + truck3.bestTime());
        System.out.println("Максимальная скорость " + truck3.maxSpeed());
        System.out.println();

        Truck truck4 = new Truck("Volvo","FH16",16,6,180);
        System.out.println(truck4);
        System.out.println();
        truck4.startMoving();
        System.out.println(truck4.pitStop());
        truck4.finishTheMove();
        System.out.println("Лучшее время " + truck4.bestTime());
        System.out.println("Максимальная скорость " + truck4.maxSpeed());
        System.out.println();


    }
}
