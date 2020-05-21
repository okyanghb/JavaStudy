package welcome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student("yanghb","NO.1",100);
        Student s2 = new Student("ligang","NO.1",100);
        Student s3 = new Student("licheng","NO.1",100);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("===1===");
        for(Student i:list){
            System.out.println(i.toString());
        }

        System.out.println("===2===");
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s= it.next();
            System.out.println(s.toString());
        }
        System.out.println("===3===");
        Object[] ar= list.toArray();
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i].toString());
        }
    }
}
