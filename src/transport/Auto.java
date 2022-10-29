package transport;

import java.time.LocalDate;

public class Auto extends Transport{

    public static class insurance {
        private final LocalDate validity;
        private final double price;
        private final String number;

        public insurance() {
            this(null, 10000, "113456789");
        }

        public insurance(LocalDate validity, Integer price, String number) {
            if (validity == null) {
                this.validity = LocalDate.now().plusDays(365);
            } else {
                this.validity = validity;
            }
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
            this.price = price;
        }

        public LocalDate getValidity() {
            return validity;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public void checkDay() {
            if (validity.isBefore(LocalDate.now()) || validity.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

    }

    public static class key {
        private boolean remoteEngineStart;
        private boolean keylessEntry;

        public key() {
            this(false, false);
        }

        public key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;


        }

        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public boolean getKeylessEntry() {
            return keylessEntry;
        }

        public void setKeylessEntry(boolean keylessEntry) {
            this.keylessEntry = keylessEntry;
        }
    }

    private static float engineVolume;
    private static String transmission;
    private static String bodyType;
    private static String registrationNumber;
    private static Integer numberOfSeats;
    private String rubber;
    private Integer maxSpeed;
    private static key key;
    private static insurance insurance;
    private static String fuelType;
    public Auto(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed,String fuelType){
        super(brand,model,color,productionYear,productionCountry,maxSpeed);
        if (fuelType.equals("бензин") || fuelType.equals("дизель") || fuelType.equals("электричество")) {
            this.fuelType=fuelType;
        }
        else {
            this.fuelType="неизвестно";
        }
    }

    @Override
    public void refill() {
        System.out.println("Приехать на заправочную станцию");
        if (fuelType.equals("дизель")) {
            System.out.println("Заправиться дизельным топливом.");
        }
        else if (fuelType.equals("бензин")){
            System.out.println("Заправиться бензиновым топливом");
        }
        else if (fuelType.equals("электричество")){
            System.out.println("Поставить автомобиль на зарядку");
        }
        else{
            System.out.println("Укажите бип топлива(бензин, дизель или электричество)");
        }
        System.out.println(fuelType);

    }

    public Auto(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed, float engineVolume,  String transmission, String bodyType, String registrationNumber, Integer numberOfSeats, String rubber, key key, insurance insurance,String fuelType) {
        super(brand,model,color,productionYear,productionCountry,maxSpeed);
        if (fuelType.equals("бензин") || fuelType.equals("дизель") || fuelType.equals("электричество")) {
            this.fuelType=fuelType;
        }
        else {
            this.fuelType="неизвестно";
        }
        if (insurance == null) {
            this.insurance = new insurance();
        } else {
            this.insurance = insurance;
        }
        if (key == null) {
            this.key = new key();
        } else {
            this.key = key;
        }

        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 2) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (rubber == null) {
            this.rubber = "default";
        } else {
            this.rubber = rubber;
        }

        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public Auto(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed, float engineVolume, String transmission, String bodyType, String registrationNumber, Integer numberOfSeats, String rubber, insurance insurance,String fuelType) {
        super(brand,model,color,productionYear,productionCountry,maxSpeed);
        if (fuelType.equals("бензин") || fuelType.equals("дизель") || fuelType.equals("электричество")) {
            this.fuelType=fuelType;
        }
        else {
            this.fuelType="неизвестно";
        }
        if (insurance == null) {
            this.insurance = new insurance();
        } else {
            this.insurance = insurance;
        }

        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 2) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (rubber == null) {
            this.rubber = "default";
        } else {
            this.rubber = rubber;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public Auto(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed, float engineVolume, String transmission, String bodyType, String registrationNumber, Integer numberOfSeats, String rubber, key key, String fuelType) {
        super(brand,model,color,productionYear,productionCountry,maxSpeed);
        if (fuelType.equals("бензин") || fuelType.equals("дизель") || fuelType.equals("электричество")) {
            this.fuelType=fuelType;
        }
        else {
            this.fuelType="неизвестно";
        }
        if (key == null) {
            this.key = new key();
        } else {
            this.key = key;
        }

        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 2) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (rubber == null) {
            this.rubber = "default";
        } else {
            this.rubber = rubber;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public Auto(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed, float engineVolume, String transmission, String bodyType, String registrationNumber, Integer numberOfSeats, String rubber,String fuelType) {
        super(brand,model,color,productionYear,productionCountry,maxSpeed);
        if (fuelType.equals("бензин") || fuelType.equals("дизель") || fuelType.equals("электричество")) {
            this.fuelType=fuelType;
        }
        else {
            this.fuelType="неизвестно";
        }
        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 2) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (rubber == null) {
            this.rubber = "default";
        } else {
            this.rubber = rubber;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setRubber(String rubber) {
        this.rubber = rubber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public static float getEngineVolume() {
        return engineVolume;
    }

    public static String getTransmission() {
        return transmission;
    }

    public static String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getRubber() {
        return rubber;
    }

    public static String getBodyType() {
        return bodyType;
    }

    public static Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setKey(Auto.key key) {
        this.key = key;
    }
    public void setInsurance() {
        this.insurance=new insurance();
    }
    public void setInsurance(Auto.insurance insurance) {
        this.insurance = insurance;
    }

    public static String getFuelType() {
        return fuelType;
    }

    public void changeRubber() {
        if (getRubber() == "летняя") {
            this.rubber = "зимняя";
        } else {
            this.rubber = "летняя";
        }
    }

    public boolean correctRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        } else {
            return true;
        }
    }
    public static void information() {
        System.out.println(getBrand() + " "
                + getModel() + ", "
                + getProductionYear() +
                " год выпуска, сборка в " + getProductionCountry() +
                ", " + getColor() + " цвет кузова, объем двигателя - " + getEngineVolume() +
                ", коробка передач " + getTransmission() +
                ", тип кузова " + getBodyType() +
                ", регистрационный номер " + getRegistrationNumber() +
                ", количество мест " + getNumberOfSeats() +
                " срок действия страховки " + insurance.getValidity()
                + ", стоимость " + insurance.getPrice() +
                ", номер страховки " + insurance.getNumber() +
                ", удаленный запуск двигателя " + key.getRemoteEngineStart()
                + ", бесключевой доступ " + key.getKeylessEntry());
    }

}