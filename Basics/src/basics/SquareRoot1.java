package basics;

public class SquareRoot1 {
	public static void main(String[] args) {
		int n=8;
		int count=0;
		int i;
		for(i=1;i<=n/2;i++)
		{
			if(i*i==n)
			{
				count++;
				break;
			}
		}
		if(count==1)
		System.out.println(i+" is a square root of: "+n);
		else
			System.out.println(n+" is not a perfect square");
	}

}
