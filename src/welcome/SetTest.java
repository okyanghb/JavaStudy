package welcome;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        Set<Character> set3 = new HashSet<Character>();

        String s = "abbccddeeg";
        System.out.println(s);

        char[] c = s.toCharArray();
        for(char b :c){
            boolean o = set1.add(b);
            if(!o){
                set2.add(b);
            }
        }
        set3.addAll(set1);
        set3.removeAll(set2);
        for(char a:set1){
            System.out.print(a);
        }
        System.out.println();
        for(char a:set2){
            System.out.print(a);
        }
        System.out.println();
        for(char a:set3){
            System.out.print(a);
        }

    }
}
