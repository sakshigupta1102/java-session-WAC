package arraylist_and_stack;

import java.util.Stack;

public class stacknextgreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = { 10, 20, 30, 60, 10, 100, 20, 80 };
		int[] arr={1,2,3,4,5};
		int[] ans = new int[arr.length];
		Stack<Integer> stack = new Stack();
		for (int i = ans.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			if (stack.empty()) {
				ans[i] = -1;

			} else {
				ans[i] =stack.peek();
			}
			stack.push(arr[i]);

		}
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+"  ");
		}

	}

}
