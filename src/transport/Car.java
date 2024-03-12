package transport;

public class Car {

    public static class Key {
        public final boolean remoteRun;
        public final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun ? "Удаленный запуск двигателя" : "Без удаленного запуска двигателя") +
                    (withoutAccess ? ". Бесключевой доступ" : ". Бесключевой доступ отсутствует");
        }
    }

    private final String brand;
    private final String model;
    private Double engineVolume;
    private String color;
    private final Integer year;
    private final String country;
    private String gear;
    private String typeOfBody;
    private String regNumber;
    private final int capacity;
    private boolean summerTires;
    private Key key;



    public Car(String brand
            , String model
            , Double engineVolume
            , String color
            , Integer year
            , String country
            , String gear
            , String typeOfBody
            , String regNumber
            , int capacity
            , boolean summerTires
            , Key key
            ) {

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setColor(color);
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
        setGear(gear);
        if (typeOfBody == null || typeOfBody.isEmpty()) {
            typeOfBody = "седан";
        }
        this.typeOfBody = typeOfBody;
        setRegNumber(regNumber);
        if (capacity <= 0) {
            capacity = 5;
        }
        this.capacity = capacity;
        this.summerTires = summerTires;
        setKey(key);
    }

    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summerTires = false;
        }
        if (month >= 4 && month <= 10) {
            summerTires = true;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "white";
        }
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if (gear == null || gear.isEmpty()) {
            gear = "МКПП";
        }
        this.gear = gear;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            regNumber = "x000xx000";
        }
        this.regNumber = regNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    @Override
    public String toString() {
        return "Автомобиль: " + brand +
                ". Модель: " + model +
                ". Объем двигателя в литрах - " + engineVolume +
                ". Цвет кузова: " + color +
                ". Год производства: " + year +
                ". Страна сборки: " + country +
                ". Коробка передач: " + gear +
                ". Тип кузова - " + typeOfBody +
                ". Регистрационный номер: " + regNumber +
                ". Количество мест: " + capacity +
                (summerTires ? ". Летняя" : ". Зимняя") + " резина. " +
                key;
    }

}
