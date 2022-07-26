package banking;

import java.util.ArrayList;

public class Bank {
	
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}

	public boolean addBranch(String branchName) {
		Branch branch = findBranch(branchName);
		
		if(branch != null) {
			return false;
		}
		
		Branch newBranch = new Branch(branchName);
		this.branches.add(newBranch);
		
		return true;
	}
	
	public boolean addCustomer(String branchName, String name, double transaction) {
		Branch branch = findBranch(branchName);
		
		if(branch == null) {
			return false;
		}
		
		return branch.newCustomer(name, transaction);
	}
	
	public boolean addCustomerTransaction(String branchName, String name, double transaction) {
		Branch branch = findBranch(branchName);
		
		if(branch == null) {
			return false;
		}
		
		return branch.addCustomerTransaction(name, transaction);
	}
	
	private Branch findBranch(String name) {
		for(Branch b : this.branches) {
			if(b.getName().equalsIgnoreCase(name)) {
				return b;
			}
		}
		return null;
	}
	
	public boolean listCustomers(String name, boolean isPrinting) {
		Branch branch = findBranch(name);
		
		if(branch == null) {
			return false;
		}
		
		System.out.println("Customer details for branch " + branch.getName());
		ArrayList<Customer> customers = branch.getCustomers();
		int count = 1;
		
		for(Customer c : customers) {
			
			System.out.println("Customer: " + c.getName() + "[" + count + "]");
			count++;
			
			if(isPrinting) {
				
				int transCount = 1;
				ArrayList<Double> transactions = c.getTransactions();
				System.out.println("Transactions");
				
				for(Double t : transactions) {
					System.out.println("[" + transCount + "]  Amount " + t);
					transCount++;
				}
			}
		}
		
		return true;
	}
	
}
