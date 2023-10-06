package basics;

import java.util.Scanner;

public class SunnyNumber1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=s.nextInt();
		String res=isSunnyNumber(a);
		System.out.println(res);
		
	}
	public static String isSunnyNumber(int a)
	{
		
	    int n=a+1;
		int count=0;
		int i=1;
		while(i<=n/2)
		{
			if(i*i==n)
			{
				count++;
				break;
			}
		}
		if(count==1)
		return " is a square root of: ";
		else
			return " is not a perfect square";
	}

}
