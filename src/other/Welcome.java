package other;

public class Welcome {
    public static void main(String[] args) {
        String s = "   Welcome to world!    ";
//        System.out.println(s);
//
//        for(int i=0;i<s.length();i++){
//            System.out.print("=");
//        }
//        System.out.println();
//
//
//        //int length()
//        int i = s.length();
//        System.out.println(i);
//
//        //String toString()
//        System.out.println(s.toString());
//
//        //boolean  endsWith()
//        System.out.println(s.endsWith("!"));
//
//        if(s.toUpperCase().startsWith("W")){
//            System.out.println(true);
//        }else if(s.toLowerCase().startsWith("w")){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//
//        String ss = s +"hhhh";
//        System.out.println(ss);
//
//        System.out.println(s.trim().lastIndexOf("!"));
//
//        for(int ii=0;ii<s.length();ii++){
//            System.out.print("=");
//        }
//        System.out.println();

        String sss = s.join("","j","a","v","a");
        System.out.println(sss);

        System.out.println(sss.substring(0));
        System.out.println(sss.substring(2));
        System.out.println(sss.substring(0,3));
        System.out.println(sss.substring(0,4));

        System.out.println(s.equals(s));
        System.out.println("java".equals(sss));
        System.out.println("JavA".equalsIgnoreCase(sss));
    }

}
