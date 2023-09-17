// Use of super keyword // 
/*
 * Super is used to refer immediate parent class instance variable
 * Super is used to invoke immediate parent class method
 * Super() is used to invoke immediate parent class constructor
 */
public class Vehicle {
    int speed=190;
}

class Bike extends Vehicle{
    int speed = 155;
    void display(){
        System.out.println(super.speed);
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.display();
    }
}
