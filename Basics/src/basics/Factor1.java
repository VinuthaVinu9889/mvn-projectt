package basics;

import java.util.Scanner;

public class Factor1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter one integer value");
		int n=s.nextInt();
		int i=1;
		int count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		System.out.println(count);
	}

}
