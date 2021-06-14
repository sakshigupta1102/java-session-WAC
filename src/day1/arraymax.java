package day1;

import java.util.Scanner;

public class arraymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i] = scan.nextInt();
		}
	//	int ans= arr[0];
		int ans= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i] > ans){
				ans= arr[i];
			}
		}
		System.out.println(ans);

	}

}
