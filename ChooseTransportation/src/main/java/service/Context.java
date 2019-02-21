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


}

