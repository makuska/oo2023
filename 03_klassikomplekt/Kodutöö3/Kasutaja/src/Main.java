import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Bmw", "Series 5", new Kasutaja("Peeter", "peeter1979",
                "pets@gmail.com", "Peeter", "Paan"));
        System.out.println(car.kasutaja.eesnimi);
        car.carUser();
        System.out.println(car.isNew);
        car.setCar();
    }
}