package main.java.model;

public abstract class Chicken {
    protected double price;

    public abstract void setPrice();

    public double getPrice() {
        return price;
    }

    public int getMaxCount(int money) {
        return (int) (money / price);
    }
}
