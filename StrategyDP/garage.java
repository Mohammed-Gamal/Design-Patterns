package StrategyDP;

// Engineer
public class garage {
    public static void main(String[] args) {

        Mechanic m = new Mechanic();

        System.out.println("Toyota car has entered the garage!");
        m.setAlgorithm(new Toyota());
        m.disassembleCar();

        System.out.println("Chevrolet car has entered the garage!");
        m.setAlgorithm(new Chevrolet());
        m.disassembleCar();

    }
}