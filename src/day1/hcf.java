package day1;

import java.util.*;

public class hcf {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dividend= scan.nextInt();
		int divisor=scan.nextInt();
		while(divisor !=0){
			int rem = dividend%divisor;
			dividend=divisor;
			divisor=rem;
		}
		System.out.println(dividend);
		
		
	}

}

