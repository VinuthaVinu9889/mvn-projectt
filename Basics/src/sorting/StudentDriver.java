package sorting;

public class StudentDriver {

	public static void main(String[] args) {
		Student []s=new Student[3];
		s[0]=new Student("Veer vade",1,26);
		s[1]=new Student("Thithi vade",1,18);
		s[2]=new Student("Sandeepa bvc",1,50);
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}

	}

}
