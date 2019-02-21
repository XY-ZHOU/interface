package main.java;

import main.java.service.Context;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList satisfiedTransports = Context.getSatisfiedTransportstion(500);
        System.out.println("有" + satisfiedTransports.size() + "方案可以选择");

    }
}
