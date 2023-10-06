package Numberseries;

public class SpyNumber {

	public static void main(String[] args) {
		int n=1126;
		int temp=n;
		int sum=0;
		int prod=1;
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+rem;
			prod=prod*rem;
			temp=temp/10;
		}
		if(sum==prod)
			System.out.println(n+ " is a spy number");
		else
			System.out.println(n+ " is not a spy number");

	}

}
