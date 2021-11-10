package com.company;

public class Coffee extends Drink {

    public Coffee(Components components) {
        super(components);
    }

    @Override
    public void makingDrink() {
        System.out.println("making Coffee");
        components.addingComponent();
    }
}
