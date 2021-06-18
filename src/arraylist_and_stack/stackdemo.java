package arraylist_and_stack;
import java.util.*;
public class stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer>  st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.peek());
		Iterator i = st.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		

	}

}
