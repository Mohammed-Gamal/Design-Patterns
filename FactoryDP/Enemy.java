package FactoryDP;

public abstract class Enemy {

    // liable variables for each enemey
    private String name;
    private int damage;
    private int health;

    // 'name' setter & getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 'damage' setter & getter
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // 'health' setter & getter
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // show-print method
    public void showUp() {
        System.out.printf("\n[%s] is showing up. Damage is [%d], Health is [%d].\n", getName(), getDamage(), getHealth());
    }

    public abstract int attack() ;

    public abstract void takeDamage(int value) ;
}