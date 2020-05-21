package chapter3;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("how much numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("what's do you need to draw?");
        int n = in.nextInt();

        BigInteger bt = BigInteger.valueOf(1);
        for(int i = 1;i<=k;i++){
            bt = bt.multiply(BigInteger.valueOf(n -i + 1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("your odds are 1 in "+bt +".Good luck!");
    }
}
