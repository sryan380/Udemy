package classesPart1;

public class Account {
	
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public Account() {
		this(56789, 2.50, "Name", "Default Adress", "default phone");
		System.out.println("Empty Constructor called");
	}
	
	public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void deposit(double value) {
		this.balance += value;
		System.out.println("Balaence is now " + this.balance);
	}
	
	public void withdraw(double value) {
		if(this.balance - value < 0) {
			this.balance -= value;
			System.out.println("Balaence is now " + this.balance);
		} else {
			System.out.println("Insufficient funds");
		}
	}
}
