package AdapterDP;

// Client
public class Client {

    public static void main(String[] args) {
        
        Vehicle car = new Car();
        playWithVehicle(car);
        
        Vehicle bicycle = new BicycleAdapter(new Bicycle());
        playWithVehicle(bicycle);
        
    }

    private static void playWithVehicle(Vehicle veh) {

        veh.accelerate();
        veh.pushBrake();
        veh.soundHorn();
        System.out.println("\n");
        
    }
}
