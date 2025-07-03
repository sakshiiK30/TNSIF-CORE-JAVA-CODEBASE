package tnsif.day4.constructor;

public class Customer {
	
	private String customerName;
	private int customerId;
	private String customerCity;
	
	public Customer()
	{
		System.out.println("hello this is Default customer --------!");
	}
	

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}



	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}

	public Customer(String customerName, int customerId, String customerCity) {
//		this(); calling default constructor 
		
		System.out.println("hello this is para constructor");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
	
}
