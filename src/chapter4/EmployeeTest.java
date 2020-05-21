package chapter4;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff =  new Employee[3];

        staff[0] = new Employee("YYY",50000,1981,1,1);
        staff[1] = new Employee("HHH",60000,1982,12,1);
        staff[2] = new Employee("BBB",40000,1984,4,3);

        for(Employee e :staff){
            e.raiseSalary(5);
        }

        for(Employee e:staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireday="+e.getHireDay());
        }
    }
}
