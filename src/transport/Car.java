package transport;

import java.util.Objects;

public class Car extends Transport{

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

    private Double engineVolume;
    private String gear;
    private String typeOfBody;
    private String regNumber;
    private final int capacity;
    private boolean summerTires;
    private Key key;

    public Car(String brand
            , String model
            , String color
            , Integer year
            , String country
            , int maxMovementSpeed
            , Double engineVolume
            , String gear
            , String typeOfBody
            , String regNumber
            , int capacity
            , boolean summerTires
            , Key key) {
        super(brand,
                model,
                color,
                year,
                country,
                maxMovementSpeed);
        setEngineVolume(engineVolume);
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

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return capacity == car.capacity
                && summerTires == car.summerTires
                && Objects.equals(engineVolume, car.engineVolume)
                && Objects.equals(gear, car.gear)
                && Objects.equals(typeOfBody, car.typeOfBody)
                && Objects.equals(regNumber, car.regNumber)
                && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                engineVolume,
                gear,
                typeOfBody,
                regNumber,
                capacity,
                summerTires,
                key);
    }

    @Override
    public String toString() {
        return "Объем двигателя в литрах - " + engineVolume +
                ". Коробка передач: " + gear +
                ". Тип кузова - " + typeOfBody +
                ". Регистрационный номер: " + regNumber +
                ". Количество мест: " + capacity +
                (summerTires ? ". Летняя" : ". Зимняя") + " резина. " +
                key;
    }

}
