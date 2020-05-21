package chapter4;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("YYY",5000);
        staff[1] = new Employee("HHH",6000);
        staff[2] = new Employee("BBB",7000);

        for(Employee e:staff){
            e.setId();
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }

        int n = Employee.getNextid();
        System.out.println("nextid="+n);
    }
}
