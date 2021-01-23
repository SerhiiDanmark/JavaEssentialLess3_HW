package task3;

public class Car extends Vehicle{

    Car(int price, int speed, int year) {
        super(price, speed, year);
    }

    String show(){
        return ("Price: " + price + ", " + "Speed: " + speed + ", " + "Year: " + year);
    }
}
