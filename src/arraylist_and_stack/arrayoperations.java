package arraylist_and_stack;
import java.util.ArrayList;

public class arrayoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] one ={1,4,7,9,11,89};
		int[] two={8,10};
		System.out.println(intersection(one, two));
	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
		int i = 0;
		int j = 0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				i++;
			} else if (one[i] > two[j]) {
				j++;
			} else {
				ans.add(one[i]);
				i++;
				j++;
			}

		}

		return ans;

	}

}
