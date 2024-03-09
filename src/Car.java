import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final Integer engineVolume;
    private final String color;
    private final Integer year;
    private final String country;

    public Car(String brand
            , String model
            , Integer engineVolume
            , String color
            , Integer year
            , String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public Integer getEngineVolume() {
        return engineVolume;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(brand, car.brand)
                && Objects.equals(model, car.model)
                && Objects.equals(engineVolume, car.engineVolume)
                && Objects.equals(color, car.color)
                && Objects.equals(year, car.year)
                && Objects.equals(country, car.country);
    }

    @Override
    public String toString() {
        return "Автомобиль: " + brand +
                ". Модель: " + model +
                ". Объем двигателя в литрах - " + engineVolume +
                ". Цвет кузова: " + color +
                ". Год производства: " + year +
                ". Страна сборки: " + country;
    }

}
