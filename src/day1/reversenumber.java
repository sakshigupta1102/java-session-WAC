package day1;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0;
		int num = 1234;
		while (num > 0) {
			int rem = num % 10; // 4
			int quo = num / 10; // 123

			ans = ans * 10 + rem;
			num = quo;

		}
		System.out.println(ans);
	}

}
