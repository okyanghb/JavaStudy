package chapter3;

import java.util.Random;

public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE =2.5;
        final int NRATES = 6;
        final int NYEARS = 25;

        double[] interestRate = new double[NRATES];
        for(int j=0;j<interestRate.length;j++){
            double x = j % 8;
            interestRate[j]=(STARTRATE + x)/100;
        }

        double[][] balances = new double[NYEARS][NRATES];
        for(int j = 0;j<balances[0].length;j++){
            balances[0][j] = 12000;
        }

        for(int i =1;i<balances.length;i++){
            for(int j = 0;j<balances[i].length;j++){
                double oldBalance = balances[i-1][j] +balances[0][j];

                double interest = oldBalance * interestRate[j];

                balances[i][j]=oldBalance + interest;
            }
        }

        for(int j = 0;j<interestRate.length;j++){
            System.out.printf("[%9.2f%%]",100*interestRate[j]);
        }

        System.out.println();

        for(double[] row:balances){
            for(double b:row){
                System.out.printf("[%10.2f]",b);
            }
            System.out.println();
        }
    }
}
