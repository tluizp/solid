import maintenance.Calculate;
import vehicle.Car;
import vehicle.Truck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Bora treinar SOLID ?");
        Calculate calculate = new Calculate();

        Car car = new Car();
        System.out.println(calculate.costYear(car));

        Truck truck = new Truck();
        System.out.println(calculate.costYear(truck));
    }
}