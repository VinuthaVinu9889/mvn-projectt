package basics;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter one integer value");
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}

}
