package arraylist_and_stack;

public class diamond_pattern_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= (2 * n - 1)) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			int val = row;
	
			while (cst <= nst) {
				if (row <= n) {
					if (cst <= nst / 2) {
						System.out.print(val);
						val--;
					} else {
						System.out.print(val);
						val++;
					}
				}
				else{
					if(cst <= nst/2)
					{System.out.print((2*n-1)- val +1  );
					val++;
					}
					else{
						System.out.print((2*n-1)- val +1);
						val--;
					}
				}

				cst++;
			}
			if (row < n) {
				nst = nst + 2;
				nsp--;
			} else {
				nst = nst - 2;
				nsp++;
			}
			System.out.println();
			row++;
		}

	}

}
