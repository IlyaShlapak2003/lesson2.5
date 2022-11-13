import Drive.Driver;
import transport.Auto;
import transport.Bus;
import transport.Truck;


public class Main {
    public static void main(String[] args) {

        Auto car1 = new Auto("Lada",
                "Granta",
                1.5f,
                3.10f, 210, Auto.bodyType.SEDAN);
        System.out.println(car1);
        System.out.println();
        Driver<Auto> nicola = new Driver<>("Васильев", "Николай", "Иванович", true, (byte) 5, car1);
        System.out.println(nicola);
        System.out.println();


        Auto car2 = new Auto("Audi",
                "A8 50 L TDI quattro",
                2, 2.60f, 250, Auto.bodyType.SEDAN);
        System.out.println(car2);
        System.out.println();
        
        Auto car3 = new Auto("BMW",
                "Z8",
                3.0f, 3.40f, 180, Auto.bodyType.COUPE);
        System.out.println(car3);
        System.out.println();

        Auto car4 = new Auto("Kia",
                "Rio",
                2.4f, 2.10f, 310, Auto.bodyType.HATCHBACK);
        System.out.println(car4);
        System.out.println();

        Bus bus1 = new Bus("Ford", "Transit", 2, 3, 190, Bus.capacitiType.SMALL);
        System.out.println(bus1);
        System.out.println();
        Driver<Bus> ivan = new Driver<>("Пертов", "Иван", "Васильевич", true, (byte) 5, bus1);
        System.out.println(ivan);
        System.out.println();

        Bus bus2 = new Bus("ГАЗ", "ГАЗель 3221", 2.5f, 5, 160, Bus.capacitiType.EXTRA_SMALL);
        System.out.println(bus2);
        System.out.println();

        Bus bus3 = new Bus("ПАЗ", "32053", 4, 9, 120, Bus.capacitiType.MEDIUM);
        System.out.println(bus3);
        System.out.println();

        Bus bus4 = new Bus("ГАЗ", "Соболь 2310", 2.5f, 4, 160, Bus.capacitiType.SMALL);
        System.out.println(bus4);
        System.out.println();

        Truck truck1 = new Truck("КамАЗ", "54901", 12, 12, 90, Truck.loadType.N1);
        System.out.println(truck1);
        System.out.println();
        Driver<Truck> danil = new Driver<>("Козлов", "Данил", "Сергеевич", true, (byte) 5, truck1);
        System.out.println(danil);
        System.out.println();

        Truck truck2 = new Truck("МАЗ", "5440М9", 13, 11, 100, Truck.loadType.N2);
        System.out.println(truck2);
        System.out.println();

        Truck truck3 = new Truck("Scania", "S730", 8, 8, 180, Truck.loadType.N3);
        System.out.println(truck3);
        System.out.println();

        Truck truck4 = new Truck("Volvo", "FH16", 16, 6, 180, Truck.loadType.N3);
        System.out.println(truck4);
        System.out.println();


    }
}
