package Homework0203.polymorphismEx3;

public class Prob1 {
public static void main(String[] args) {
    Truck truck = new Truck("트럭",0,4);
    Bike bike = new Bike("자전거",0,2);

    truck.wheelNumber();
    bike.wheelNumber();
    truck.speedUp(100);
    bike.speedUp(25);
    truck.speedDown(20);
    bike.speedDown(30);
    truck.stop();
    bike.stop();
    truck.speedUp(10);

	
}
}
