package sorting;

public class BinarySearch {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};
		int low=0;
		int high=a.length-1;
		int key=100;
		int count=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==a[mid])
			{
				count++;
				break;
			}
			else if(key>a[mid])
				low=mid+1;
			else
				high=mid-1;
		}
		if(count==1)
			System.out.println("Key element is found");
		else
			System.out.println("Key element not found");

	}

}
