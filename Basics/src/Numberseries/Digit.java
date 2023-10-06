package Numberseries;

public class Digit {

	public static void main(String[] args) {
		int n=1234;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			System.out.print(rem);
			n=n/10;
		}

	}

}
