package basics;

public class SunnyNumber {
	public static void main(String[] args) {
		int a=9;
		int n=a+1;
		int i=1;
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
			System.out.println(a+" is a sunny number");
		else
			System.out.println(a+" is not a sunny number");
	}

}
