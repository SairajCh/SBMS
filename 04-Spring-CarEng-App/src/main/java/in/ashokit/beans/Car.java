package in.ashokit.beans;

public class Car {
	
	private IEngine eng;
	
	public Car() {
		System.out.println("Car constructor");
			// TODO Auto-generated constructor stub
	
	}
	
	
	
	public Car(IEngine eng) {
		//super();
		System.out.println("constructor works");
		this.eng = eng;
	}



	public void setEng(IEngine eng) {
		System.out.println("setter works");
		this.eng=eng;
	}
	
	public void drive() {
		int status = eng.start();
		if(status>=1) {
			System.out.println("Journey Started");
			
		} else {
			System.out.println("Engine Trouble....");
		}
		
	}

}
