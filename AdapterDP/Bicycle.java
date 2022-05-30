package AdapterDP;

// Adaptee
public class Bicycle {

    public void pedal(){
        System.out.println("Bicycle starts moving...");
    }

    public void stop() {
        System.out.println("Bicycle stopped moving!");
    }

    public void ringBell() {
        System.out.println("Ring ring!");
    }
}
