package ThreadSafe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*  Example of ThreadSafe Singleton  */
public class ThreadSafeSingleton {

    // Array of Letters
    private String[] LETTERS = { "a", "b", "c", "d", "e"};

    // List holds the array of letters
    private List<String> data = Arrays.asList(LETTERS);

    // Static instance of the class (volatile so it is not cached)
    private static volatile ThreadSafeSingleton instance;

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {

            synchronized (ThreadSafeSingleton.class) {
                if(instance == null)
                    instance = new ThreadSafeSingleton();
            }

        }
        return instance;
    }

    private ThreadSafeSingleton() {
        Collections.shuffle(data);
    }

    public void printData() {
        for(String item: data) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }
}