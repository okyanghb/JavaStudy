package chapter4;

public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Test tripleValue");
        double percent =10;
        System.out.println("Before:percent="+percent);
        tripleValue(percent);
        System.out.println("After:percent="+percent);

        System.out.println("========================");

        System.out.println("Test tripleSalary");
        Employee harry = new Employee("Harry",50000);
        System.out.println("Before:salary="+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After:percent="+harry.getSalary());

        System.out.println("========================");

        System.out.println("\nTesting swap:");
        Employee a = new Employee("Alice",70000);
        Employee b = new Employee("Bob",60000);
        System.out.println("Before:a="+a.getName());
        System.out.println("Before:b="+b.getName());
        swap(a,b);
        System.out.println("End:a="+a.getName());
        System.out.println("End:b="+b.getName());
    }

    private static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("Before:x="+x.getName());
        System.out.println("Before:y="+y.getName());
    }

    private static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method:salary="+x.getSalary());
    }

    private static void tripleValue(double x) {
        x = 3*x;
        System.out.println("End of method:percent="+x);
    }
}
