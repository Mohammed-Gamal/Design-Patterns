package AdapterDP;

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Car starts moving...");
    }

    @Override
    public void pushBrake() {
        System.out.println("Car Stopped moving!");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beep beep!");
    }
    
}
