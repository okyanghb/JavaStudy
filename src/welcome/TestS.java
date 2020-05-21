package welcome;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        char[] c = s.toCharArray();
        for(char d :c){
            if(map.containsKey(d)){
                Integer value = map.get(d);
                value++;
                map.put(d,value);
            }else{
                map.put(d,1);
            }
        }

        System.out.println("===1===");
        Set<Character> set = map.keySet();
        for(Character character :set){
            System.out.println(character+":"+map.get(character));
        }

        System.out.println("===2===");
        Set<Map.Entry<Character,Integer>> entries =map.entrySet();
        for(Map.Entry<Character,Integer> entry :entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
