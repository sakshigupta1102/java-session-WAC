package arraylist_and_stack;

import java.util.Stack;

public class validparanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "((()))())(";
		if(validparanthesis(str)){
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}

	}

	public static boolean validparanthesis(String str) {
		Stack<Character> stack = new Stack();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(') {
				stack.push('(');
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					stack.pop();
				}
			}

		}
		if(!stack.empty()){
			return false;
		}
		return true;

	}

}
