package transport;

public class Bus extends Transport {
    private static String appointment;
    private static Integer numberOfSeats;
    private static String registrationNumber;
    private static String fuelType;


    public Bus(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed, String fuelType) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        if (fuelType.equals("бензин") || fuelType.equals("дизель")) {
            this.fuelType=fuelType;
        }
        else {
            this.fuelType="неизвестно";
        }
    }

    public Bus(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed, String appointment, Integer numberOfSeats, String registrationNumber, String fuelType) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        if (appointment == null || appointment.isEmpty() || appointment.isBlank()) {
            this.appointment = "неизвестно";
        } else {
            this.appointment = appointment;
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
        if (fuelType.equals("бензин") || fuelType.equals("дизель")) {
            this.fuelType=fuelType;
        }
        else {
            this.fuelType="неизвестно";
        }
    }

    public static String getAppointment() {
        return appointment;
    }

    public static String getFuelType() {
        return fuelType;
    }

    public static Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public static String getRegistrationNumber() {
        return registrationNumber;
    }

    public static void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            Bus.registrationNumber = "х000хх000";
        } else {
            Bus.registrationNumber = registrationNumber;
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
    @Override
    public void refill() {
        System.out.println("Приехать на заправочную станцию");
        if (fuelType.equals("дизель")) {
            System.out.println("Заправиться дизельным топливом.");
        }
        else if (fuelType.equals("бензин")){
            System.out.println("Заправиться бензиновым топливом");
        }
        else{
            System.out.println("Укажите бип топлива(бензин или дизель)");
        }

    }
    public static void information() {
        System.out.println(getBrand() + " "
                + getModel() + ", "
                + getProductionYear() +
                " год выпуска, сборка в " + getProductionCountry() +
                ", " + getColor() + " цвет кузова" +
                ", регистрационный номер " + getRegistrationNumber() +
                ", количество мест " + getNumberOfSeats() + ", назначение " + getAppointment());
    }
}

