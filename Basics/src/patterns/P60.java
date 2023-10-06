package patterns;

import java.util.Scanner;

public class P60 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any integer number");
		int n=s.nextInt();
		
		int space=n/2, star=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.println(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			if(i<=n/2) {
				space--;
				star=star+2;
			}
			else {
				space++;
				star=star-2;
			}
		}
		


	}

}
