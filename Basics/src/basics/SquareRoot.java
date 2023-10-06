package basics;

public class SquareRoot {
	public static void main(String[] args) {
		int n=10;
		int i=0;
		int count=0;
		while(i<=n/2)
		{
			if(i*i==n)
			{
				count++;
				break;
			}
			i++;
		}
		if(count==1)
			System.out.println(i+" is the square root of: "+n);
		else
			System.out.println(n+" is not a perfect square");
				
	}

}
