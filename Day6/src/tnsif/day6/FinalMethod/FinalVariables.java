package tnsif.day6.FinalMethod;

public class FinalVariables {

//	final int a; // we have to initialize final instacnce
	
	final int x=100;
	
//	declare static blank final variable 
	
	final static int y;
	
	final static int z=10;
	
//	instance method
	
	void change()
	{
//		a=20;
//		x=30;  final varaible cannot be change or re assign
//		z=50;
		
	}

	
	@Override
	public String toString() {
		return "FinalVariables [x=" + x + ", y=" + y + "]";
	}
	
	static
	{
		y=230;
		System.out.println();
	}
	

	
	
}
