package other;


import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<Person> lists = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setName("yanghb");
		p1.setAddress("beijing");
		lists.add(p1);

		Person p2 = new Person();
		p2.setName("yanghb2");
		p2.setAddress("beijing2");
		lists.add(p2);

		for(Person p:lists){
			System.out.println(p.getName()+":"+p.getAddress());
		}

		Object[] o=lists.toArray();
		for(int i =0;i<o.length;i++){
		    Person p = (Person)o[i];
            System.out.println(p.getName()+":"+p.getAddress());
        }
	}
}
