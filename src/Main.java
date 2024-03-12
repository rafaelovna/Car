import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada",
                "Granta",
                1.7,
                "yellow",
                2015,
                "Russia",
                "автомат",
                "седан",
                "м111м111",
                5, true, new Car.Key(true, true));
       /* Car audi = new Car("audi", "a8", 3.0, "black", 2020, "German");
        Car bmw = new Car("BMW", "z8", 3.0, "black", 2021, "German");
        Car kia = new Car("kia", "Sportage", 2.4, "red", 2018, "Korea");
        Car hyundai = new Car(null, "Avante", 1.6, "orange", 2016, "Korea");
*/
        System.out.println(lada);
       /* System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);*/


    }


}