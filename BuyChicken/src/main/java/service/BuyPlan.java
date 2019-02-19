package main.java.service;

import main.java.model.Chick;
import main.java.model.Chicken;
import main.java.model.Cock;
import main.java.model.Hen;

public class BuyPlan {
    public static void main(String[] args) {
        Chicken chick = new Chick(1.0/3);
        Chicken cock = new Cock(5);
        Chicken hen = new Hen(3);
        int maxOfCock=cock.getMaxCount(100);
        int maxOfHen=hen.getMaxCount(100);
        for(int cockNum=0;cockNum<=maxOfCock;cockNum++){
            if((100-7*cockNum)%4==0){
                int henNum = (100-7*cockNum)/4;
                if(0<=henNum && henNum<=maxOfHen){
                    int  chickNum=100-cockNum-henNum;
                    System.out.println("小鸡："+chickNum+",母鸡："+henNum+"，公鸡："+cockNum);
                }
            }
        }
    }
}
