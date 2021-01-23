package task3;

public class Main {

    public static void main(String[] args) {

    Car car = new Car(10000, 150, 2010);
    Plane plane = new Plane(650000, 960, 2014, 750, 130);
    Ship ship = new Ship(1230000, 250, 2017, 450, "Bavaria");

        System.out.println("Car: \n" + car.show());
        System.out.println("Plane: \n" + plane.show());
        System.out.println("Ship: \n" + ship.show());
    }
}
