package chapter3;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what's your name?");
        String s = sc.nextLine();

        System.out.println("how old are you?");
        int i = sc. nextInt();

        System.out.println("Hello,"+s+"your age is "+i);
    }
}
