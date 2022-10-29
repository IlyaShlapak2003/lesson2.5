package transport;

public class Train extends Transport {
    static float tripPrice;
    static float travelTime;
    static String departureStationName;
    static String finalStopStation;
    static int numberOfWagon;

    public Train(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Приехать в депо");
        System.out.println("Заправиться дизельным топливом");
    }

    public Train(String brand, String model, String color, Integer productionYear, String productionCountry, Integer maxSpeed, float tripPrice, float travelTime, String departureStationName, String finalStopStation, int numberOfWagon) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        if (tripPrice > 0) {
            this.tripPrice = tripPrice;
        } else {
            this.tripPrice = 1000f;
        }
        if(travelTime==0){
            this.travelTime=2.30f;
        }
        else{
            this.travelTime=travelTime;
        }
        if (departureStationName==null || departureStationName.isBlank() || departureStationName.isEmpty()){
            this.departureStationName="Неизвестно";
        }
        else {
            this.departureStationName=departureStationName;
        }
        if (finalStopStation==null || finalStopStation.isBlank() || finalStopStation.isEmpty()){
            this.finalStopStation="Неизвестно";
        }
        else {
            this.finalStopStation=finalStopStation;
        }
        if (numberOfWagon==0){
            this.numberOfWagon=2;
        }
        else {
            this.numberOfWagon=numberOfWagon;
        }
    }

    public static float getTripPrice() {
        return tripPrice;
    }

    public static void setTripPrice(float tripPrice) {
        if (tripPrice > 0) {
            Train.tripPrice = tripPrice;
        } else {
            Train.tripPrice = 1000f;
        }
    }

    public static float getTravelTime() {
        return travelTime;
    }

    public static void setTravelTime(float travelTime) {
        if(travelTime==0){
            Train.travelTime=2.30f;
        }
        else{
            Train.travelTime=travelTime;
        }
    }

    public static String getDepartureStationName() {
        return departureStationName;
    }

    public static void setDepartureStationName(String departureStationName) {
        if (departureStationName==null || departureStationName.isBlank() || departureStationName.isEmpty()){
            Train.departureStationName="Неизвестно";
        }
        else {
            Train.departureStationName=departureStationName;
        }
    }

    public static String getFinalStopStation() {
        return finalStopStation;
    }

    public static void setFinalStopStation(String finalStopStation) {
        if (finalStopStation==null || finalStopStation.isBlank() || finalStopStation.isEmpty()){
            Train.finalStopStation="Неизвестно";
        }
        else {
            Train.finalStopStation=finalStopStation;
        }
    }

    public static int getNumberOfWagon() {
        return numberOfWagon;
    }

    public static void setNumberOfWagon(short numberOfWagon) {
        if (numberOfWagon==0){
            Train.numberOfWagon=2;
        }
        else {
            Train.numberOfWagon=numberOfWagon;
        }
    }
    public static void information() {
        System.out.println(getBrand() + " "
                + getModel() + ", "
                + getProductionYear() +
                " год выпуска, сборка в " + getProductionCountry() +
                ", " + getColor() + " цвет кузова, максимальная скорость "
                + getMaxSpeed() +", цена поездки " +
                getTripPrice()+", время поездки "+
                getTravelTime()+", название станции отбытия "
                +getDepartureStationName()+", конечная остановка "
                +getFinalStopStation()+", колличество вагонов "+getNumberOfWagon());

    }
}