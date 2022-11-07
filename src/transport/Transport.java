package transport;

import java.util.Objects;

public abstract class Transport implements Competing {

    private static String brand;
    private static String model;
    private static float engineVolume;
    private static float bestTime;
    private static float maxSpeed;



    public Transport(String brand, String model, float engineVolume,float bestTime, float maxSpeed) {
        if (bestTime<=0){
            Transport.bestTime = 1.5f;
        }
        else {
            Transport.bestTime=bestTime;
        }
        if (maxSpeed<=0){
            Transport.maxSpeed=100;
        }
        else{
            Transport.maxSpeed=maxSpeed;
        }
        if (engineVolume == 0) {
            Transport.engineVolume = 1.5f;
        } else {
            Transport.engineVolume = engineVolume;
        }
        Transport.brand = Objects.requireNonNullElse(brand, "default");
        Transport.model = Objects.requireNonNullElse(model, "defult");

    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public static float getBestTime() {
        return bestTime;
    }

    public static float getMaxSpeed() {
        return maxSpeed;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume == 0) {
            Transport.engineVolume = 1.5f;
        } else {
            Transport.engineVolume = engineVolume;
        }
    }

    public static float getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMoving();

    public abstract void finishTheMove();

}