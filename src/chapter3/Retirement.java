package chapter3;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("how much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.println("how much money do you cost per year?");
        double payment = in.nextDouble();

        System.out.println("rate in %:");
        double rate = in.nextDouble();

        double balance=0;
        int year = 0;

        while(balance < goal){
            balance += payment;
            double interest = balance *rate/100;
            balance += interest;
            year++;
        }
        System.out.println("you can retire in"+year+"years!");
    }
}
