package AdapterDP;

// Adapter
public class BicycleAdapter implements Vehicle {
    
    private Bicycle bicycle;

    // Parameterized Constructor
    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        bicycle.pedal();
    }

    @Override
    public void pushBrake() {
        bicycle.stop();
    }

    @Override
    public void soundHorn() {
        bicycle.ringBell();
    }
    
}
