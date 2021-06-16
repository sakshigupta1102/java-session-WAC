package stringquestions;
import java.util.Arrays;
import java.util.Collections;
public class demo {
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// String str= "hello";
//		// String str2 = str.concat("world");
//		// System.out.println(str2);
//
//		String str1 = "hello";
//		// String str2= "hello";
//		// String str3 = "hello";
//		// String str4 = new String("hello");
//		// System.out.println(str1== str2); // true
//		// System.out.println(str2==str3); // true
//		// System.out.println(str1==str4); // false
//		// System.out.println(str1.equals(str4)); // true
//
//		String str = "ABC";
////		System.out.println(str.substring(2));
////		System.out.println(str.substring(2,9));
////		System.out.println(str.substring(2,3));
//		
//		for(int i=0;i<str.length();i++){
//			for(int j=i+1;j<= str.length();j++){
//				System.out.println(str.substring(i, j));
//			}
//		}
//		String a= "Hello";
//		String b= "hello";
//		Integer[] arr={1,6,8,9,0};
//		Arrays.sort(arr);
//		Arrays.sort(arr, Collections.reverseOrder());
//		System.out.println(a.equalsIgnoreCase(b));
//		
		
//		long start = System.currentTimeMillis();
//		int n=100000;
	StringBuilder sb = new StringBuilder("hello");
//		for(int i=0;i<=n;i++){
//			sb.append(i);
//		}
//		long end = System.currentTimeMillis();
		//System.out.println(end-start);
		
//		sb.append("world");
//		System.out.println(sb);
//		sb.setCharAt(0, 'p');
//		System.out.println(sb);
//		sb.insert(3, 'i');
//		System.out.println(sb);
//		sb.deleteCharAt(3);
//		System.out.println(sb);
//		sb.toString();
	
	
	String str1="hElLOwOrlD";
	StringBuilder sb1 =new StringBuilder(str1);
	for(int i=0;i<str1.length();i++){
		char ch = str1.charAt(i);
		if(ch>= 'a' && ch <= 'z'){
			sb1.setCharAt(i, Character.toUpperCase(ch));
		}
		else if(ch>= 'A' && ch <= 'Z'){
			sb1.setCharAt(i, Character.toLowerCase(ch));
		}
		
		
		
	}
	
	System.out.println(sb1.toString());	
	
	
	
	
	
	
	
	
		
		
		
		
	}

}
