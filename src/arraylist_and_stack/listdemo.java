package arraylist_and_stack;
import java.util.ArrayList;

public class listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(3, 100000);
		list.set(2, 100);
		list.remove(1);
		System.out.println(list.get(3));
		System.out.println(list.size());
        System.out.println(list);
        for(int i=0;i<list.size();i++){
        	System.out.println(list.get(i));
        }

	}

}
