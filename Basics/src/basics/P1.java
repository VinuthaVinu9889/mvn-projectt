package basics;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 integer values");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a<c||a<b&&a>c)
			System.out.println(a+" is the mid value");
		else if(b>a&&b<c||b<a&&b>c)
			System.out.println(b+" is the mid value");
		else
			System.out.println(c+" is the mid value");
		
	}

}
