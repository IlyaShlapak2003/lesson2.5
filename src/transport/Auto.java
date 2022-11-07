package transport;

public class Auto extends Transport implements Competing {


    public Auto(String brand, String model, float engineVolume, float bestTime, float maxSpeed) {
        super(brand, model, engineVolume, bestTime, maxSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println("Завести двигатель " + getBrand() + " " + getModel());
        System.out.println("Прогреть до необходимой температуры");
        System.out.println("Подъехать к старту");
        System.out.println("Начать заезд когда загорится зеленый");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Завершить гонку");
        System.out.println("Заехать в бокс");
        System.out.println("Заглушить двигатель и покинуть автомобиль " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel();
    }

    @Override
    public String pitStop() {
        return "Заезжаем в бокс, производим замену колес, заправляем, проверяем все технические показатели, если все в норме продолжаем заезд, иначе пытаемся устранить поломку";
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