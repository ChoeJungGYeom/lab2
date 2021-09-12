package lab2;

public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public int compareTo(Student o)
	{
		return name.compareTo(o.name);
	}
	//Student(int no1, String name1, int age1) {no = no1; name = name1; age = age1;}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	};
	
}
