package sorting;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int []a= {10,50,20,25,40,8,9,7,4,2};
	int n=a.length;
	System.out.println("Before sorting");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+ " ");
	}
	Arrays.sort(a,n/2,n);
	System.out.println("After sorting");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+ " ");
	}
	
}
}
