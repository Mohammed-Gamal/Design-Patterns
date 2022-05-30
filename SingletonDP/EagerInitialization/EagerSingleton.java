package EagerInitialization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*  Example of the using Singleton (EagerSingleton Initialization)  */
public class EagerSingleton {

    // Array of Letters
    private String[] LETTERS = { "a", "b", "c", "d", "e"};

    // List that holds array of letters
    private List<String> data = Arrays.asList(LETTERS);

    // Static instance of the class
    private static EagerSingleton instance = new EagerSingleton();

    /*
     * Getterthod: Initialize the instance if it was null and return it
     * @return instance of the class
     */
    public static EagerSingleton getInstance() {
        return instance;
    }

    /*
     * Public Constructor
     * Shuffles the letters in the List
     */
    public EagerSingleton() {
        Collections.shuffle(data);
    }

    // Loops through the list and print the letter out
    public void printData() {
        for(String item: data) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }
}