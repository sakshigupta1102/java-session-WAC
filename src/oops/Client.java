package oops;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal m1 = new Mammal();
		m1.run();
		m1.eat();
		m1.feedmilk();
		System.out.println(m1.no_of_legs);
	//	Mammal m2 = new Animal();  not possible
		Animal a= new Animal();
		a.run();
		a.eat();
		System.out.println(a.no_of_legs);
		
		Animal a1 = new Mammal();
		System.out.println(a1.no_of_legs);
		a1.run();
		a1.eat();
		
		
		
		
	
	}

}

