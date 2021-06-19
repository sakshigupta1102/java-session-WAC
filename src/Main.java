public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human h = new human();
		student s = new student();
		human h1 = new student();
		System.out.println(h1.a);
		System.out.println(s.a);
		System.out.println(h.a);
		h1.hey();
		h.hey();
		s.hey();

	}

}

class human {
	int a = 10;

	public void hey() {
		System.out.println("i am human");
	}
}

class student extends human {
	int a = 20;

	public void hey() {
		System.out.println("i am student");
	}

}
