package main.java.service;

import main.java.model.Bus;
import main.java.model.SelfDriving;
import main.java.model.Train;
import main.java.model.Transportation;

import java.util.ArrayList;

public class Choose {
    public static void main(String[] args) {
        Transportation selfDriving = new SelfDriving(500);
        Transportation bus = new Bus(300);
        Transportation train = new Train(400);
        Transportation plane = new SelfDriving(1000);

        int num = 0;
        ArrayList<Integer> priceArr = new ArrayList<Integer>();
        priceArr.add(selfDriving.getPrice());
        priceArr.add(bus.getPrice());
        priceArr.add(train.getPrice());
        priceArr.add(plane.getPrice());
        for (int i = 0; i < priceArr.size(); i++) {
            if (500 >= priceArr.get(i)) {
                num++;
            }
        }
        System.out.println("有" + num + "方案可以选择");
    }
}

