package day1;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int nst = n;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();

			row++;
		}

	}

}
