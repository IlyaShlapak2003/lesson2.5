package transport;

public class Truck extends Transport{


    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Завести двигатель");
        System.out.println("Прогреть до необходимой температуры");
        System.out.println("Включить передачу и подъехать к старту");
        System.out.println("Тронуться когда загорится зеленый");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Завершить гонку");
        System.out.println("Заехать в бокс");
        System.out.println("Заглушить двигатель");
        System.out.println("Покинуть автомобиль");
    }

    @Override
    public String toString() {
        return getBrand()+ " " + getModel()+ " "+getEngineVolume();
    }
}
