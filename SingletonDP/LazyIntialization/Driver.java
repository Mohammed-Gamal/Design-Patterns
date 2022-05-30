package LazyIntialization;

public class Driver {

    public static void main(String[] args) {

        //Test First Usage (Lazy Singleton)
        testLazySingleton();
    }

    /*
     * Test LazySingleton. create 2 instances and print out the letters
     */
    private static void testLazySingleton() {
        LazySingleton inst1 = LazySingleton.getInstance();
        LazySingleton inst2 = LazySingleton.getInstance();

        System.out.println(inst1.hashCode());
        inst1.printData();

        System.out.println(inst2.hashCode());
        inst2.printData();
    }
}