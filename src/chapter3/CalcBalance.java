package chapter3;

import java.util.Scanner;

public class CalcBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("how much money do you save every year?");
        double save = sc.nextDouble();

        System.out.println("interest rate %:");
        double rate = sc.nextDouble();

        System.out.println("how many year do you save?");
        int year = sc.nextInt();

        double balance = 0 ;

        while(year > 1 ){
            balance += save;
            double interest = balance * rate /100;
            balance += interest;
            year--;
        }
        System.out.println(balance);
    }
}
