package EagerInitialization;

public class Driver {

    public static void main(String[] args) {

        // Test First Usage (Lazy Singleton)
        testEagerSingleton();
    }

    /*
     * Test EagerSingleton. Create 2 instances and print out the letters
     */
    private static void testEagerSingleton() {
        EagerSingleton inst1 = new EagerSingleton();
        EagerSingleton inst2 = new EagerSingleton();

        System.out.println(inst1.hashCode());
        inst1.printData();

        System.out.println(inst2.hashCode());
        inst2.printData();
    }
}