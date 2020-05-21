package welcome;

import java.util.*;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> li = new ArrayList<Employee>();
        Employee e1 = new Employee();
        Employee e2 = new Employee("zhangxueyou",24,100);
        Employee e3 = new Employee("liming",20,100);
        Employee e4 = new Employee("liming",20,100);
        e1.setName("liudehua");
        e1.setAge(20);
        e1.setSalary(100);
        li.add(e1);
        li.add(e2);
        li.add(e3);
        li.add(e4);

        Set<Employee> set = new HashSet<Employee>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        List<Employee> listSet = new ArrayList<Employee>(set);

        System.out.println("===LIST前===");
        for(Employee e:li){
            System.out.println(e.toString());
        }
        System.out.println("===Set===");
        for(Employee e:set){
            System.out.println(e.toString());
        }

        method(li);
        method(listSet);

        System.out.println("===LIST后===");
        for(Employee e:li){
            System.out.println(e.toString());
        }
        System.out.println("===set后===");
        for(Employee e:listSet){
            System.out.println(e.toString());
        }

        Map<Integer, Employee> map = new HashMap<Integer,Employee>();
        map.put(1,e1);
        map.put(2,e2);
        map.put(3,e3);
        map.put(4,e4);

        System.out.println("===map===");
        Set<Map.Entry<Integer,Employee>> entries=map.entrySet();
        for(Map.Entry<Integer,Employee> entry :entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("===map转list后===");
        Set<Integer> set1 = map.keySet();
        List<Integer> keyList = new ArrayList<Integer>(set1);
        for(Integer e:keyList){
            System.out.println(e.toString());
        }

        Collection<Employee> mapValueToList= map.values();
        List<Employee> mapList = new ArrayList<Employee>(mapValueToList);
        method(mapList);
        for(Employee e:mapList){
            System.out.println(e.toString());
        }
    }

    private static void method(List<Employee> li) {
        for(int i = 1;i<li.size()-1;i++){
            for(int j =0;j<li.size()-1;j++){
                Employee emp1 = li.get(j);
                Employee emp2 = li.get(j+1);
                if(emp1.getSalary() < emp2.getSalary()){
                    li.set(j,emp2);
                    li.set(j+1,emp1);
                }else if(emp1.getSalary() == emp2.getSalary()){
                    if(emp1.getAge() < emp2.getAge()){
                        li.set(j,emp2);
                        li.set(j+1,emp1);
                    }else if(emp1.getAge()==emp2.getAge()){
                        if(emp1.getName().compareTo(emp2.getName())>0){
                            li.set(j,emp2);
                            li.set(j+1,emp1);
                        }
                    }
                }
            }
        }
    }
}
