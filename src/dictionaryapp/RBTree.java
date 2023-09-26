package dictionaryapp;

public class RBTree {
	private RBNode root;
	
	public RBTree() {
		root = null;
	}
	

	public void insert(String word) {
		if (root == null) {
			root = new RBNode(word, false);
		}
	}
	
	public void checkWord(String word) {
		//TODO: search function
	}
	
	private void rrotate(RBNode top) {
		if (top==null) {
			return;
		}
		
		RBNode newTop = top.getLeftChild();
		top.getParent().switchChild(top, newTop);
		top.setLeftChild(newTop.getRightChild());
		newTop.setRightChild(top);
	}
	
	private void lrotate(RBNode top) {
		if (top==null) {
			return;
		}
		
		RBNode newTop = top.getRightChild();
		top.getParent().switchChild(top, newTop);
		top.setRightChild(newTop.getLeftChild());
		newTop.setLeftChild(top);
	}
}
