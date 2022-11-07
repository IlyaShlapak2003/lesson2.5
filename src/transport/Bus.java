package transport;

public class Bus extends Transport implements Competing {


    public Bus(String brand, String model, float engineVolume, float bestTime, float maxSpeed) {
        super(brand, model, engineVolume, bestTime, maxSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println("Заводим двигатель автобуса " + getBrand() + " " + getModel());
        System.out.println("Прогреваем до необходимой температуры и проверяем все технические показатели");
        System.out.println("Подъезжаем к старту");
        System.out.println("Начинаем заезд когда загорается зеленый");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Завершаем гонку");
        System.out.println("Заезжаем в бокс");
        System.out.println("Заглушим двигатель автобуса");
        System.out.println("Покидаем автобус " + getBrand()+ " "+ getModel());
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel();
    }

    @Override
    public String pitStop() {
        return "Заезжаем в бокс, производим замену колес, заправляем, покидаем бокс и продолжаем заезд";
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

