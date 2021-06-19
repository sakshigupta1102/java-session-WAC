package oops;

public class Mammal extends Animal  {

	int birthcycleinyear;
	int no_of_legs=10;

	
	public void run() {
		System.out.println("mammal is running");
	}

	public void eat() {
		System.out.println("mammal is eating");
	}

	public void feedmilk() {
		System.out.println("mammal can feed");
	}

	public void givebirth() {
		System.out.println("mammal can give milk");
	}

}
