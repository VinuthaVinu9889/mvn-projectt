package mock;

public class Reverse {

	public static void main(String[] args) {
		int []n= {1234};
		int rev=0;
		int i = 0;
		while(n[i]>0)
		{
			int rem=n[i]%10;
			System.out.print(rem);
			n[i]=n[i]/10;
		}

	}

}
