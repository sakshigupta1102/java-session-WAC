package arraylist_and_stack;

import java.util.ArrayList;

public class sumoftwonos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one = { 9, 9, 9 };
		int[] two = { 1 };
		System.out.println(sumofnos(one, two));

	}

	public static ArrayList<Integer> sumofnos(int[] one, int[] two) {
		// logic here
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = one.length - 1;
		int j = two.length - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0)
				sum = sum + one[i];

			if (j >= 0)
				sum = sum + two[j];

			int rem = sum % 10;
			carry = sum / 10;
			list.add(0, rem);
			i--;
			j--;
		}

		if (carry > 0) {
			list.add(0, carry);
		}
		return list;
	}

}
