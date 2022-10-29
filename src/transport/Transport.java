package transport;

public abstract class Transport {

    private static String brand;
    private static String model;
    private static float engineVolume;


    public Transport(String brand, String model, float engineVolume) {
        if (engineVolume == 0) {
            Transport.engineVolume = 1.5f;
        } else {
            Transport.engineVolume = engineVolume;
        }
        if (brand == null) {
            Transport.brand = "default";
        } else {
            Transport.brand = brand;
        }
        if (model == null) {
            Transport.model = "defult";
        } else {
            Transport.model = model;
        }

    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
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