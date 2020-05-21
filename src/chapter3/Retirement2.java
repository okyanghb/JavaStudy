package chapter3;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("how much money do you cost per year?");
        double payment = in.nextDouble();

        System.out.println("rate in %:");
        double rate = in.nextDouble();

        double balance=0;
        int year = 0;

        String input;

        do {
            balance += payment;
            double interest = balance *rate/100;
            balance += interest;
            year++;
            System.out.printf("After %d year ,your balance is %,.2f%n",year,balance);
            System.out.println("Ready to retire?(Y/N)");
            input = in.next();
        }
        while(input.equals("N"));
    }
}
