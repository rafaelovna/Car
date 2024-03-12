package transport;

import java.util.Objects;

public class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final Integer year;
    private final String country;
    private int maxMovementSpeed;


    public Transport(String brand,
                     String model,
                     String color,
                     Integer year,
                     String country,
                     int maxMovementSpeed) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setColor(color);
        setMaxMovementSpeed(maxMovementSpeed);
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
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

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        if (maxMovementSpeed < 0) {
            maxMovementSpeed = 240;
        }
        this.maxMovementSpeed = maxMovementSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return maxMovementSpeed == transport.maxMovementSpeed
                && Objects.equals(brand, transport.brand)
                && Objects.equals(model, transport.model)
                && Objects.equals(color, transport.color)
                && Objects.equals(year, transport.year)
                && Objects.equals(country, transport.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, year, country, maxMovementSpeed);
    }

    @Override
    public String toString() {
        return "Автомобиль: " + brand +
                ". Модель: " + model +
                ". Цвет кузова: " + color +
                ". Год производства: " + year +
                ". Страна сборки: " + country +
                ". Максимальная скорость передвижения: " + maxMovementSpeed;
    }
}
