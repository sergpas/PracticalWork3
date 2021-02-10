package com.alfa.work31;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double WEIGHT_GUNT_IN_GRAMM = 453.6;
        System.out.println("Enter Weight in Funts : ");
        Scanner scan = new Scanner(System.in);
        double weightInFunt = scan.nextDouble();
        double weightInGramm = weightInFunt * WEIGHT_GUNT_IN_GRAMM;
        System.out.println("Weight: "+(int)Math.floor(weightInGramm/1000) + " KG and " + (int)(weightInGramm%1000) +" Gramm" );
    }
}
