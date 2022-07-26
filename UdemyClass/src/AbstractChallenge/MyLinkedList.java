package AbstractChallenge;

public class MyLinkedList implements NodeList{
	
	private ListItem root;
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean additem(ListItem add) {
		if(root.compareTo(add) == 0) {
			return false;
		}
		//add more
		return true;
	}

	@Override
	public boolean removeItem(ListItem remove) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		if(root == null) {
			System.out.println("The List is empty");
		}
	}
	
}
