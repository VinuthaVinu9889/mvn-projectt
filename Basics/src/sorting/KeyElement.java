package sorting;

import java.util.Scanner;

public class KeyElement {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int []a= {40,50,10,20,5,70,2};
	System.out.println("Enter the key element");
	int key=s.nextInt();
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(key==a[i])
		{
			count++;
			break;
		}
	}
	if(count==1)
		System.out.println("Key element found");
	else
		System.out.println("Key element not found");
}
}
