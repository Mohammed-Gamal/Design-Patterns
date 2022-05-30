package TemplateDP;

public abstract class MakePizza {

    private void bakePizza() {
        System.out.println("Baking the Pizza...");
    }

    abstract void definePizzaShape();


    private void putAddons() {
        System.out.println("Putting the Pizza Addons...");
    }

    private void heatPizza() {
        System.out.println("Heating the Pizza...");
    }

    void makePizza() {
        bakePizza();
        definePizzaShape();
        putAddons();
        heatPizza();
    }

}