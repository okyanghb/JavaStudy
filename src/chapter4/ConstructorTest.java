package chapter4;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("YYY",5000);
        staff[1] = new Employee(6000);
        staff[2] = new Employee();

        for(Employee e:staff){
            e.setId();
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }


        Random r = new Random();
        int count = 0;
        while (true) {

            int ai = r.nextInt(1000);
            if(ai==10){
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}
