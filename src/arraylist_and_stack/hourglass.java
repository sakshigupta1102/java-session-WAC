package arraylist_and_stack;

public class hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = n;
		int nsp = 0;
		while (row <= n * 2) {
			int cst = 1;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			if (row < n) {
				nsp++;
				nst--;

			} else if (row == n) {
			} else {
				nsp--;
				nst++;
			}
			row++;
			System.out.println();
		}
	}

}
