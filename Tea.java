package com.company;

public class Tea extends Drink {

    public Tea(Components components) {
        super(components);
    }

    @Override
    public void makingDrink() {
        System.out.println("making Tea");
        components.addingComponent();
    }
}
