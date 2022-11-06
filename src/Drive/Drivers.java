package Drive;

import transport.Auto;
import transport.Bus;
import transport.Competing;
import transport.Truck;

public class Drivers<B extends Auto & Competing, D extends Bus & Competing, C extends Truck & Competing> {
    private String surname;
    private String name;
    private String patronymic;
    private String FNP;
    private boolean driverLicense;
    private byte experience;

    public Drivers(String surname, String name, String patronymic, boolean driverLicense, byte experience, B Auto) {
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
    public Drivers(String surname, String name, String patronymic, boolean driverLicense, byte experience, D Bus) {
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
    public Drivers(String surname, String name, String patronymic, boolean driverLicense, byte experience, C Truck) {
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
    public void startMoving() {
        System.out.println("Завести двигатель");
        System.out.println("Прогреть до необходимой температуры");
        System.out.println("Включить передачу и тронуться");
    }

    public void stop() {
        System.out.println("Остановиться");
        System.out.println("Заглушить двигатель");
        System.out.println("Покинуть автомобиль");
    }

    public void refuelTheCar() {
        System.out.println("Заехать на заправку");
        System.out.println("Заглушить авто и заправиться");
        System.out.println("Завести авто и уехать с заправки");
    }
    public void control(B Auto){
        System.out.println("Водитель "+FNP+" управляет автомобилем "+ transport.Auto.getBrand()+" "+ transport.Auto.getModel()+" и будет учавствовать в заезде.");
    }
    public void control(C Truck){
        System.out.println("Водитель "+FNP+" управляет автомобилем "+ transport.Truck.getBrand()+" "+ transport.Truck.getModel()+" и будет учавствовать в заезде.");
    }
    public void control(D Auto){
        System.out.println("Водитель "+FNP+" управляет автомобилем "+ transport.Bus.getBrand()+" "+ transport.Bus.getModel()+" и будет учавствовать в заезде.");
    }

}
