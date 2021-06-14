package day1;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		for(int i=1;i<=5;i++){
			int sum=a+b;
			System.out.println(a);
			a=b;
			b=sum;
		}
		

	}

}
