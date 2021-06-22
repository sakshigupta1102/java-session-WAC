package oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.print();

	}

}
interface printclass{
	void print();
	void display();
	
}
interface show{
	void print();
	void show();
}
class Test implements show,printclass{

	@Override
	public void print() {
		System.out.println("printed");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
