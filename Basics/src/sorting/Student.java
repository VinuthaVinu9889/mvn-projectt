package sorting;

public class Student {
	String name;
	int id;
	int age;
	Student(){}
	public Student(String name,int id,int age)
	{
		super();
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public void display()
	{
		System.out.println("***Details of Student***");
		System.out.println("Student Name: " +name);
		System.out.println("Student ID: " +id);
		System.out.println("Student AGE:" +age);
		System.err.println("***********************");
	}

}

