package org.example;

public class Drink implements Product {
    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }
}
