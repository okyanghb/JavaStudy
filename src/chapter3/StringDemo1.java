package chapter3;

import java.util.stream.IntStream;

public class StringDemo1 {
    String s1 ;
    public static void main(String[] args) {
        String s = "hello";
        if("hello".equalsIgnoreCase(s)){
            System.out.println("yes");
        }else if(s =="hello"){
            System.out.println(s+"=hello");
        }

        //s1为空时，长度为0
        String s1="";
        if(s1.length() ==0 ){
            System.out.println(s1+"length() ==0 ");
        }else if(s1 == null ){
            System.out.println("s1 == null ");
        }else if(s1.equals(null)){
            System.out.println("s1.equals(null)");
        }

        String s2="helloworld";
        char a = s2.charAt(0);
        System.out.println(a);
        int x = s2.offsetByCodePoints(0,2);

        for (int i =0;i<s2.length();i++){
            System.out.print(s2.charAt(i));
            System.out.println(s2.codePointAt(i));
        }

        IntStream ls = s2.codePoints();
        int[] l = ls.toArray();
        System.out.print("[");
        for(int i =0;i<l.length;i++) {
            if(i == (l.length-1)){
                System.out.print((char)l[i]+"]");
            }else{
                System.out.print((char)l[i]+",");
            }
        }
    }
}
