package main.java.model;

public class Chicken {
    private double price;

    public Chicken(double price) {
        this.price = price;
    }

    public int getMaxCount(int money) {
        return (int) (money / price);
    }
}
