package AbstractChallenge;

public interface NodeList {
	abstract ListItem getRoot();
	abstract boolean additem(ListItem add);
	abstract boolean removeItem(ListItem remove);
	abstract void traverse(ListItem root);
}
