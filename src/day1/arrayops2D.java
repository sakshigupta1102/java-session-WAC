package day1;

import java.util.Scanner;

public class arrayops2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{10,20,30},{40,50,60},{70,80,90}};
		wave(arr);

	}
	public static void wave(int[][] arr){
		for(int col =0;col<arr[0].length;col++){
			if(col % 2 == 0){
				for(int row=0;row<arr.length;row++){
					System.out.print(arr[row][col]+"  ");
				}
			}
			else{
				for(int row = arr.length-1;row>= 0 ;row--){
					System.out.print(arr[row][col]+"  ");
				}
			}
			
			
			
		}
	}
	public static void verticalprint(int[][] arr){
		//your logic here
		for(int col =0;col<arr[0].length;col++){
			for(int row=0;row<arr.length;row++){
				System.out.print(arr[row][col]+"  ");
			}
		}
		
		
	}

	public static int[][] takeinput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter rows");
		int rows = scan.nextInt();
		int[][] arr = new int[rows][];
		for (int i = 0; i < rows; i++) {
			System.out.println("enter columns for my " + i + " th row");
			int col = scan.nextInt();
			// very important
			arr[i] = new int[col];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter value for " + i + " row " + j
						+ " col ");
				arr[i][j] = scan.nextInt();
			}

		}
		return arr;
		

	}
	
	public static void display(int[][] arr){
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}
	}
	

}
