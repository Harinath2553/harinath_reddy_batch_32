package runtime_polymorphism;

public class Main extends overiding{
	
	@Override
	public void test() {
		System.out.println("Arya Vishnu");
	}


	public static void main(String[] args) {
		
		overiding o =new Main();
		o.test();
	}

}
