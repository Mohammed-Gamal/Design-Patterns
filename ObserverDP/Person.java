package ObserverDP;

public class Person implements Observer {

    // Person's name
    private String name;

    // Parameterized Constructor
    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.printf("%s has received new notification: %s\n", this.name, message);
    }
}
