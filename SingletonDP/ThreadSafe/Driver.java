package ThreadSafe;

public class Driver {

    public static void main(String[] args) {

        //Test Second Usage (Thread Safe)
        testThreadSafeSingleton();

    }

    private static void testThreadSafeSingleton() {

        new DataPrinter().start();
        new DataPrinter().start();

    }
}

// Dummy Thread that calls the getInstance and printData method
class DataPrinter extends Thread {

    @Override
    public void run() {
        ThreadSafeSingleton.getInstance().printData();
    }
}