package task3;

public class Ship extends Vehicle{

    int passengersCount;
    String port;
    Ship(int price, int speed, int year, int passengersCount, String port) {
        super(price, speed, year);

        this.passengersCount = passengersCount;
        this.port = port;
    }

    String show(){
        return ("Price: " + price + ", " + "Speed: " + speed + ", " + "Year: " + year + ", " + "Passengers: " + passengersCount + ", " + "Port: " + port);
    }
}
