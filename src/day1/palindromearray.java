package day1;

import java.util.Scanner;

public class palindromearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "hello";
//		String str2="hello";
//		String str3 = new String("hello");
//		System.out.println(str1==str2); //true
//		System.out.println(str2==str3); //false
//		System.out.println(str2.equals(str3)); //true
//		
		//charAt
//		String str="hello";
//		for(int i=0;i<str.length();i++){
//			System.out.println("character at "+ i +" position  " + str.charAt(i));
//		}

		Scanner scan = new Scanner(System.in);
		String str= scan.next();
//		for(int i=0;i<str.length();i++){
//			if(str.charAt(i) == 'a' || str.charAt(i)=='i' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i)=='u'
//					||str.charAt(i) == 'A' || str.charAt(i)=='E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i)=='U'){
//				System.out.print(str.charAt(i)+"  ");
//			}
//		}
		char ch = scan.next().charAt(0);
		int ans=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				ans++;
			}
		}
		
		System.out.println(ans);
		
		
		
		
		
		
	}

}

