package sorting;

public class Sorting {
public static void main(String[] args) {
	int [] a= {10,50,20,25,40,8,5,3,9,10};
	int n=a.length;
	System.out.println("Before sorting");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+ " ");
	}
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println("After sorting");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+ " ");
	}
}
}
