package day1;
import java.util.Scanner;
public class palindromeinarray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr1= new int[5];
		for(int i=0;i<5;i++){
			arr1[i] = scan.nextInt();
		}
		int[] arrrev = new int[5];
		int flag=0;
		for(int i=0;i<5;i++){
			arrrev[i] = arr1[arr1.length-i-1];
		}
		
		for(int i=0;i<5;i++){
			if(arr1[i] != arrrev[i] ){
				System.out.println("it is not a palindrome");
				flag=1;
				break;
			}
		}
	  if(flag==0){
		  System.out.println("it is a palindrome");
	  }
		
		
		
		
		

	}

}
