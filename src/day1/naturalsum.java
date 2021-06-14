package day1;

public class naturalsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + "  ");
//			sum = sum + i;
//		}
//		System.out.println("*********");
//		System.out.println(sum);

		int i=1;
		while(i<=5){
			sum+= i;
			i++;
		}
		System.out.println(sum);
		
	}

}
