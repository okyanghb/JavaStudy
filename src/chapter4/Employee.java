package chapter4;

import java.time.LocalDate;
import java.util.Random;

public class Employee {

    private static int nextid=1;

    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    static{
        Random generator = new Random();
        nextid = generator.nextInt(1000);
    }

    {
        id = nextid;
        nextid++;
    }

    public Employee(){}

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary){
        this("Emplyee #"+nextid,salary);
    }

    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNextid() {
        return nextid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextid;
        nextid++;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public static void main(String[] args) {
        Employee e = new Employee("harry",5000);
        System.out.println(e.getName()+","+e.getSalary());
    }
}
