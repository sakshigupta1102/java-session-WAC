
public class ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int row=1;
		int nst=1;
		
		while(row<= n){
			int cst=1;
			char ch='A';
			while(cst<= nst){
				System.out.print(ch+" ");
				ch++;
				cst++;
			}
			row++;
			nst++;
			System.out.println();
		}
		
	}

}
