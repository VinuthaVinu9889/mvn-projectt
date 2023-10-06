package Numberseries;

public class Product {

	public static void main(String[] args) {
		int n=389897;
		int prod=1;
		while(n>0)
		{
			int rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		System.out.println(prod);

	}

}
