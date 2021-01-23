package task3;

public class Plane extends Vehicle{

    double height;
    int passengersCount;

    Plane(int price, int speed, int year, double height, int passengersCount) {
        super(price, speed, year);

        this.height = height;
        this.passengersCount = passengersCount;
    }

    String show(){
        return ("Price: " + price + ", " + "Speed: " + speed + ", " + "Year: " + year + ", " + "Passengers: " + passengersCount + ", " + "Height: " + height);
    }
}
