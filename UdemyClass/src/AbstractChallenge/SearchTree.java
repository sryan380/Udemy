package AbstractChallenge;

public class SearchTree implements NodeList{
	
	private ListItem root;

	public SearchTree(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean additem(ListItem add) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeItem(ListItem remove) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		
	}
	
	private void performRemoval(ListItem child, ListItem parent) {
		// TODO
	}
}
