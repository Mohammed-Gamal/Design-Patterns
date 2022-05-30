package LazyIntialization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*  Example of the using Singleton (LazySingleton Initialization)  */
public class LazySingleton {

    // Array of Letters
    private String[] LETTERS = { "a", "b", "c", "d", "e"};

    // List that holds array of letters
    private List<String> data = Arrays.asList(LETTERS);

    // Static instance of the class
    private static LazySingleton instance;

    /*
     * Getterthod: Initialize the instance if it was null and return it
     * @return instance of the class
     */
    public static LazySingleton getInstance() {
        if(instance == null)
            instance = new LazySingleton();
        return instance;
    }

    /*
     * Private Constructor
     * Shuffles the letters in the List
     */
    private LazySingleton() {
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