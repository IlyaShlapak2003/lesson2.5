package transport;

public abstract class Transport {

    private static String brand;
    private static String model;
    private static String color;
    private static Integer productionYear;
    private static String productionCountry;
    private static Integer maxSpeed;

    public Transport(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed) {

        this.maxSpeed = maxSpeed;

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "defult";
        } else {
            this.model = model;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == null) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }
    public abstract void refill();

    public static Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static String getColor() {
        return color;
    }


    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public static Integer getProductionYear() {
        return productionYear;
    }

    public static String getProductionCountry() {
        return productionCountry;
    }

    public static void information() {
        System.out.println(getBrand() + " "
                + getModel() + ", "
                + getProductionYear() +
                " год выпуска, сборка в " + getProductionCountry() +
                ", " + getColor() + " цвет кузова, максимальная скорость " + getMaxSpeed()+".");

    }


}