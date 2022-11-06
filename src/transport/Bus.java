package transport;

public class Bus extends Transport implements Competing{


    public Bus(String brand, String model, float engineVolume, float bestTime, float maxSpeed) {
        super(brand, model, engineVolume, bestTime, maxSpeed);
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

    @Override
    public String pitStop() {
        return "Заезжаем в бокс, производим замену колес, заправляем, выезжаем из бокса";
    }

    @Override
    public float bestTime() {
        return getBestTime();
    }

    @Override
    public float maxSpeed() {
        return getMaxSpeed();
    }
}

