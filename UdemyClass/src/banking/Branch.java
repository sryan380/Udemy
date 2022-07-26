package banking;

import java.util.ArrayList;

public class Branch {
	
	private String name;
	private ArrayList<Customer> customers;
	
	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return this.customers;
	}
	
	public boolean newCustomer(String name, double transaction) {
		if(findCustomer(name) == null) {
			Customer toAdd = new Customer(name, transaction);
			this.customers.add(toAdd);
			return true;
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String name, double transaction) {
		Customer customer = findCustomer(name);
		if(customer != null) {
			customer.addTransaction((Double) transaction);
			return true;
		}
		return false;
	}
	
	private Customer findCustomer(String name) {
		for(Customer c : this.customers) {
			if(c.getName().equalsIgnoreCase(name)) {
				return c;
			}
		}
		return null;
	}
	
}
