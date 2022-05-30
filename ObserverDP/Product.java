package ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    // Product's name and availability
    private String name;
    private String availablity;

    // list to hold all observers
    private List<Observer> observerList;

    // Parameterized Constructor
    public Product(String name) {
        this.name = name;
        this.observerList = new ArrayList<>();
    }

    // name getter
    public String getName() {
        return this.name;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer: observerList) {
            observer.update(availablity);
        }
    }

    // Set the product avaiablity based on boolean value and notify all observers
    public void setAvailablity(boolean available) {
        availablity = this.name + (available ? " [Available]." : " [Not available].");
        notifyAllObservers();
    }
}
