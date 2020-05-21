package welcome;

public class Calc {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 4;

        c +=b +=  a;

        System.out.println(a+","+b+","+c);

        int sum = getF(10);
        System.out.println(sum);
    }


    public static int getF(int count){
        int sum =0;
        if (count == 1 || count == 0) {
            return 1;
        } else  {
            return  getF(count-1)+getF(count-2);
        }
    }
}
