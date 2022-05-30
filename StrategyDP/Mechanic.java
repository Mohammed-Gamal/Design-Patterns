package StrategyDP;

public class Mechanic {

    private Algorithm algorithm;

    public void disassembleCar() {
        algorithm.performAlgorithm();
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

}