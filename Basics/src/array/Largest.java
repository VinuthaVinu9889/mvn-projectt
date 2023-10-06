package array;

import java.util.Scanner;

public class Largest {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int []a= {10,5,25,30,35,15,30};
	System.out.println("Enter the n value from 1 to " +a.length);
	int n=s.nextInt();
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>a[i])
			{
				count++;
			}
		}
		if(count==n-1)
		{
			System.out.println(a[i]);
			break;
		}
	}
}
}
