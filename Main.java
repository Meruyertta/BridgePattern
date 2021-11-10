package com.company;

public class Main {

    public static void main(String[] args) {
        Drink SweetTea=new Tea(new Sugar());
        SweetTea.makingDrink();
        Drink CoffeeWithMilk=new Coffee(new Milk());
        CoffeeWithMilk.makingDrink();
    }
}
