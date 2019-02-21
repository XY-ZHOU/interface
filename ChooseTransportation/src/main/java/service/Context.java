package main.java.service;

import main.java.model.*;

import java.util.ArrayList;

public class Context {
    public static ArrayList<Integer> allTranspots = new ArrayList<>();

    static {
        SelfDriving selfDriving = new SelfDriving();
        Bus bus = new Bus();
        Train train = new Train();
        Plane plane = new Plane();
        allTranspots.add(selfDriving.getPrice());
        allTranspots.add(bus.getPrice());
        allTranspots.add(train.getPrice());
        allTranspots.add(plane.getPrice());
    }

    public static ArrayList getSatisfiedTransportstion(int money) {
        ArrayList<Integer> satisfiedTransports = new ArrayList<>();
        for (int i = 0; i < allTranspots.size(); i++) {
            if (allTranspots.get(i) <= money) {
                satisfiedTransports.add(allTranspots.get(i));
            }
        }
        return satisfiedTransports;
    }
}

