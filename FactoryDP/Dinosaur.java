package FactoryDP;

public class Dinosaur extends Enemy {

    // Constructor
    public Dinosaur() {
        setName("Dinosaur");
        setDamage(9);
        setHealth(50);
    }

    @Override
    public void takeDamage(int value) {
        if (getHealth() > 0) {
            setHealth(getHealth() - value);
            System.out.printf("\n%s Took [%d] damage and health is [%d] %n", getName(), value, getHealth());
        }
    }

    @Override
    public int attack() {
        return getDamage();
    }
}