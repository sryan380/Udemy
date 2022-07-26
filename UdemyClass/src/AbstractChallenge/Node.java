package AbstractChallenge;

public class Node extends ListItem {

	public Node(Object value) {
		super(value);
	}

	@Override
	ListItem next() {
		return this.rightLink;
	}

	@Override
	ListItem setnext(ListItem next) {
		return this.rightLink = next;
	}

	@Override
	ListItem previous() {
		return this.leftLink;
	}

	@Override
	ListItem setPrevious(ListItem previous) {
		return this.rightLink = previous;
	}

	@Override
	int compareTo(ListItem compare) {
		// incomplete
		if(value.equals(compare)) {
			return 0;
		} else {
			return 1;
		}
	}
}
