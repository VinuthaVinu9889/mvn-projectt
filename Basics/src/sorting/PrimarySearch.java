package sorting;

public class PrimarySearch {

	public static void main(String[] args) {
	 int []a= {1,3,4,5,7,9};
	 for(int i=1;i<10;i++)
	 {
		 int count=0;
		 for(int j=0;j<a.length;j++)
		 {
			 
			 if(i==a[j])
			 {
				 count++;
				 break;
			 }
		 }
		 
		 if(count==0)
			 System.out.println(i);
		 
	 }

	}

}
