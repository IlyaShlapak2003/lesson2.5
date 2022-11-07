package Drive;

import transport.*;

public class Driver<T extends Transport & Competing> {
    private final String surname;
    private final String name;
    private final String patronymic;
    private final String FNP;
    private boolean driverLicense;
    private byte experience;


    public Driver(String surname, String name, String patronymic, boolean driverLicense, byte experience, T Transport) {
        if (surname == null || surname.isEmpty() || surname.isBlank()) {
            this.surname = "unknown";
        } else {
            this.surname = surname;
        }
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "unknown";
        } else {
            this.name = name;
        }
        if (patronymic == null || patronymic.isEmpty() || patronymic.isBlank()) {
            this.patronymic = "unknown";
        } else {
            this.patronymic = patronymic;
        }
        this.FNP = this.surname + " " + this.name + " " + this.patronymic;
        this.driverLicense = driverLicense;
        if (experience < 0) {
            this.experience = 1;
        } else {
            this.experience = experience;
        }
    }

    public void startMoving(T Transport) {
        System.out.println("Завести двигатель " + Transport);
        System.out.println("Прогреть до необходимой температуры");
        System.out.println("Включить свет и передачу, тронуться");
    }

    public void stop(T Transport) {
        System.out.println("Остановиться");
        System.out.println("Заглушить двигатель и выключить свет");
        System.out.println("Покинуть автомобиль " + Transport);
    }

    public void refuelTheCar(T Transport) {
        System.out.println("Заехать на заправку");
        System.out.println("Заглушить "+ Transport +" и заправиться");
        System.out.println("Завести " +Transport + "и уехать с заправки");
    }

    public String toString() {
        return "Водитель "+FNP+" управляет автомобилем "+ transport.Transport.getBrand()+" "+ transport.Transport.getModel()+" и будет учавствовать в заезде.";
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setExperience(byte experience) {
        this.experience = experience;
    }
}
