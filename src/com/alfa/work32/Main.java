package com.alfa.work32;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Deposit Amount : ");
        double depoAmount = scan.nextDouble();
        System.out.println("Enter Deposit Month : ");
        int depoMonth = scan.nextInt();
        System.out.println("Enter Deposit Percent : ");
        int depoPercent = scan.nextInt();
        double depoProfit=(depoAmount*depoPercent*depoMonth/12)/100;
        System.out.println("Deposit Profit: "+depoProfit);
    }
}
