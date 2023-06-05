package Abstract_demo;
public class AbstractDemo extends Department {
	@Override
	public int getDepartmentSize() {
		System.out.println(1);
		return 1;
	}
	
	public static void main(String[] args) {
		
		AbstractDemo a= new AbstractDemo();
		a.getDepartmentSize();
	}

	

}
