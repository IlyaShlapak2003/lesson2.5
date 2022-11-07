package transport;

public class Truck extends Transport implements Competing{


    public Truck(String brand, String model, float engineVolume, float bestTime, float maxSpeed) {
        super(brand, model, engineVolume, bestTime, maxSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println("Заводим двигатель "+ getBrand() +" "+getModel() );
        System.out.println("Прогреваем до необходимой температуры");
        System.out.println("Включаем дополнительные устройства и подъезжаем к старту");
        System.out.println("Начинаем заезд когда загорится зеленый");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Завершаем заезд");
        System.out.println("Заезжаем в бокс");
        System.out.println("Заглушим двигатель");
        System.out.println("Покидаем грузовой автомобиль "+getBrand()+" "+getModel());
    }

    @Override
    public String toString() {
        return getBrand()+ " " + getModel();
    }

    @Override
    public String pitStop() {
        return "Заезжаем в бокс, производим замену колес, заправляем, проверяем технические показатели "+getBrand()+" "+getModel() +" выезжаем из бокса";
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
