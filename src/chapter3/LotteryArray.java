package chapter3;

public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;

        int[][] odds = new int[NMAX+1][];
        for(int n = 0 ;n<=NMAX;n++){
            odds[n] = new int[n+1];
        }

        for(int n =0;n<odds.length;n++){
            for(int m =0;m<odds[n].length;m++){
                int lotteryOdds = 1;
                for(int i =1;i<=m;i++){
                    lotteryOdds  =  lotteryOdds * (n-i+1);
                }
                odds[n][m]=lotteryOdds;
            }
        }

        for(int[] rows:odds){
            for(int b:rows){
                System.out.printf("[%4d]",b);
            }
            System.out.println();
        }
    }
}
