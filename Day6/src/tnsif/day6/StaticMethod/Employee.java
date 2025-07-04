package tnsif.day6.StaticMethod;

public class Employee {
//	declare instance varaible

	private String name;
	private int id;
	
	
//	static company name with data
	
	static String companyname ="TNSIF";


	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ",companyname=" + companyname + ", ]";
	}
	
	
	
}
