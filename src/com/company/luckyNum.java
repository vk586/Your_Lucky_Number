package com.company;

public class luckyNum {
    private int fNum;
    private int range;
    private String name;

    public luckyNum(int r, String s) {
        range = r;
        name = s;
    }


    public int perfectRandom() {
        boolean perfect = false;
        while (!perfect) {
            int rand = (int) (Math.random() * Math.abs(range));
            double pNum = Math.sqrt(rand);

            if (pNum % 1 == 0) {
                perfect = true;

            } else {
                perfect = false;
            }
            fNum = rand;
        }
        return fNum;
    }

    public String stateName() {
        return name;
    }
}