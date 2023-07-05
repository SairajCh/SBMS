package in.ashokit.beans;

public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		// TODO Auto-generated constructor stub
		System.out.println("Petrol engine constructor");
	
	}
	
	public int start() {
		// TODO Auto-generated method stub
		System.out.println("Petrol Engine Started...");
		return 1;
	}

}
