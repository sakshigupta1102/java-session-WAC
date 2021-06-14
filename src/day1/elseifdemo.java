package day1;

import java.util.Scanner;

public class elseifdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		int b=scan.nextInt();
		System.out.println("1 fo add 2 for subtract 3 for multiply 4 for divide");
		int command=scan.nextInt();
		if(command==1) System.out.println(a+b);
		else if(command==2) System.out.println(a-b);
		else if(command==3) System.out.println(a*b);
		else if(command==4) 
			{
			if(b==0) System.out.println("divide by zero not possible");
			else System.out.println(a/b);
			}
		else System.out.println("wrong input");
		
		
	}

}
