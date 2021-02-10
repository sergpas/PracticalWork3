package com.alfa.work33;

public class Main {
    public static void main(String[] args) {
        double firstCost = 830.0;
        double secondCost = firstCost - firstCost * 13 / 100;
        double lastCost = secondCost + secondCost * 7 / 100;
        System.out.println("Last Cost: " + lastCost);
    }
}