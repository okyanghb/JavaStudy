package chapter3;

import java.util.Scanner;

public class Lotteryodds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("how much numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("what's do you need to draw?");
        int n = in.nextInt();

        int s = 1;
        for(int i = 1;i<=k;i++){
            s = s * (n -i + 1)/i;
        }
        System.out.println("your odds are 1 in "+s+".Good luck!");
    }
}
