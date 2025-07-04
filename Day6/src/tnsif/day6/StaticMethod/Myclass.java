package tnsif.day6.StaticMethod;

public class Myclass {

	private int section; //non static
	
	private static int srNo;  //static
	
//	static block
	static
	{
		System.out.println("--this is static block---");
		srNo=1000;
//		section=101; we cannot assign the non static value in static block
		
	}
	
	public Myclass(){
		
		System.out.println("---within default constructor--");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
	static void display() {
//		System.out.println("section="+section);
		
		System.out.println("serial no= "+ srNo);
	}
}