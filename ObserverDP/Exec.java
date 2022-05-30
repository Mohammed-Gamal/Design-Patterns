package ObserverDP;

public class Exec {

    public static void main(String[] args) {
        //Instnace of the product
        Product clock = new Product("Panasonic Clock");

        //Person Observable
        Person ahmed = new Person("Ahmed");
        Person mohamed = new Person("Mohamed");
        Person gamal = new Person("Gamal");

        // Add observers to the product object
        clock.addObserver(ahmed);
        clock.addObserver(mohamed);
        clock.addObserver(gamal);

        // Simple loop to simulate the product availability
        for(int i = 0; i < 3; i++) {
            // Example of removing obsever
            if (i == 2) {
                clock.removeObserver(gamal);
            }

            // Set avaibality based on the value of i for demo purposes
            boolean available = (i % 2 == 0);

            System.out.printf("Product Availability: '%s' is %b.\n", clock.getName(), available);

            clock.setAvailablity(available);

            System.out.println("\n");
        }

    }
}
