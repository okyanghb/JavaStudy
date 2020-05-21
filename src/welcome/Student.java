package welcome;

public class Student {
    private String name;
    private String classname;
    private double grade;

    Student(String name, String classname,double grade){
        this.name = name;
        this.classname=classname;
        this.grade= grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", classname='" + getClassname()  + '\'' +
                ", grade=" + getGrade() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
