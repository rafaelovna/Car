import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada",
                "Granta",
                "yellow",
                2015,
                "Russia",
                180,
                1.7,
                "МКПП",
                "Седан",
                "м111м111", 5,true, new Car.Key(true, true));
        Car audi = new Car("audi", "a8", "black", 2020, "German", 220,
                2.0, "АКПП", "Седан", "А123АП333", 5, true,
                new Car.Key(true, false));
//        Car bmw = new Car("BMW", "z8", 3.0, "black", 2021, "German");
//        Car kia = new Car("kia", "Sportage", 2.4, "red", 2018, "Korea");
//        Car hyundai = new Car(null, "Avante", 1.6, "orange", 2016, "Korea");
//       System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println(hyundai);

        System.out.println(lada);
        System.out.println(audi);


        Bus avtobus = new Bus("Ikar", "1", "White",
                2016, "Russia", 240);
        System.out.println(avtobus);

    }




}