package by.issoft.b;

public class VehicleRunner {



    public static void main(String[] args) {

        Vehicle truck = new Truck();
        truck.setNum("111-22");
        truck.setMaxWeight(2_000);

        Car car = new Car();
        car.setNum("222-22");
        car.setMaxWeight(2_000);
        ((Car) car).setNumPassengers(5);


        //overriding, dynamic method lookup
        CarParking parking = new ParkingMultiLevel();
        parking.park(car);

    }

}

class Train {


}
