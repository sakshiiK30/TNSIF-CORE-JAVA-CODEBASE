package tnsif.day3.Scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob=new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person Name :");
		name= ob.next();
		System.out.println("Enter Age :");
		int age =ob.nextInt();
		System.out.println("Enter gender :");
		String gender = ob.next();
		
		System.out.println("Enter the mo no :");
		long mobileNumber=ob.nextLong();
		System.out.println("enter income :");
		int income = ob.nextInt();
		
		
//		initialize value
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setMobileNumber(mobileNumber);
		person.setIncome(income);
		
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		System.out.println(person.getMobileNumber());
		System.out.println(person.getIncome());
		
		System.out.println(person.getTax());
		
		
		//person details using toString()
		
		System.out.println(person);
		
		System.out.println("After creating tax object ");
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("After Calculation of tax :");
		
		
		System.out.println(person );
		

	}

}
