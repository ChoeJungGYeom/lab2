package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		// Create arraylist of user-defined class objects
		List<Student> al=new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101 ,"Kim",23);
		al.add(s1); // adding Student class object
		Student s2 = new Student(102,"Choi",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Jun",21));
		al.add(new Student(105,"Choe",29));
		al.add(new Student(106,"Kim",31));
		al.add(new Student(107,"Hong",23));
		al.add(new Student(108,"Yoon",21));
		al.add(new Student(109,"Min",22));
		al.add(new Student(110,"Kang",19));
		
		Collections.sort(al);
		for (Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println(":Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for (int i=0; i<al.size();i++) {
			System.out.println(al.get(i).toString());
		}
	}
}