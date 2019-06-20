package by.issoft.b;

public class VehicleRunner {

    public static void main(String[] args) {

        Truck truck = new Truck();
        truck.setNum("111-22");
        truck.setMaxWeight(2_000);

        Car car = new Car();
        car.setNum("222-22");
        car.setMaxWeight(2_000);

        park(truck);
    }

    public static void park(Vehicle v) {
        String num = v.getNum();
        System.out.println("I am parking vehicle: " + num);

        if(v instanceof Car) {
            Car car  = (Car) v;
            System.out.println(car.getNumPassengers());
        } else if(v instanceof Truck) {
            Truck t  = (Truck) v;
        }





        //1. video
        //2. hotkeys
        //3. список того что мы делали
        //4. код
        //5. список почитать на след раз
    }

}

class Train {

    Train[] t = split(4)

}
