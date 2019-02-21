package main.java.service;

import main.java.model.Chick;
import main.java.model.Cock;
import main.java.model.Hen;

public class BuyPlan {
    public static void buyChicken(int money, int count) {
        Chick chick = new Chick();
        Cock cock = new Cock();
        Hen hen = new Hen();
        chick.setPrice();
        cock .setPrice();
        hen.setPrice();
        double chickPrice = chick .getPrice();
        double cockPrice = cock.getPrice();
        double henPrice = hen.getPrice();
        int maxOfCock = cock.getMaxCount(100);
        int maxOfHen = hen.getMaxCount(100);
        for (int i = 0; i <= maxOfCock; i++) {
            for (int j = 0; j <= maxOfHen; j++) {
                int chickNum = count - i - j;
                if (i * cockPrice + j * henPrice + chickNum * chickPrice == money) {
                    System.out.println("买小鸡：" + chickNum + "只,母鸡：" + j + "只，公鸡：" + i+"只");
                }
            }

        }
    }
}
