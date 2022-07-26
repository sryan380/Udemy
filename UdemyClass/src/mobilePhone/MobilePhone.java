package mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
	
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	
	public boolean addNewContact(Contact contact) {
		boolean isAdded = false;
		if(findContact(contact.getName()) == -1) {
			myContacts.add(contact);
			isAdded = true;
		}
		return isAdded;
	}
	
	public boolean updateContact(Contact old, Contact newContact) {
		boolean isSuccess = false;
		if(findContact(old.getName()) >= -1) {
			this.myContacts.set(findContact(old), newContact);
			isSuccess = true;
		}
		return isSuccess;
	}
	
	public boolean removeContact(Contact remove) {
		boolean isRemoved = false;
		if(findContact(remove.getName()) >= 0) {
			myContacts.remove(findContact(remove));
			isRemoved = true;
		}
		return isRemoved;
	}
	
	private int findContact(Contact contact) {
		return myContacts.indexOf(contact);
	}
	
	private int findContact(String name) {
		int pos = -1;
		for(Contact c: myContacts) {
			if(c.getName().equalsIgnoreCase(name)) {
				return myContacts.indexOf(c);
			}
		}
		return pos;
	}
	
	public Contact queryContact(String name) {
		int pos = findContact(name);
		if(pos >= 0) {
			return myContacts.get(pos);
		}
		return null;
	}
	
	public void printContacts() {
		int count = 1;
		System.out.println("Contact List:");
		for(Contact c : myContacts) {
			System.out.println(count + ". " + c.getName() + " -> " + c.getPhoneNumber());
			count++;
		}
	}
}

















