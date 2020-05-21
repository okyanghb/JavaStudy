package chapter3;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("ch");
        sb.append(1);

        String s = sb.toString();
        System.out.println(s);
    }
}
