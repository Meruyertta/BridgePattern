package com.company;

public abstract class Drink {
    protected Components components;

    public Drink(Components components) {
        this.components = components;
    }

    public abstract void makingDrink();

}
