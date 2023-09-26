package dictionaryapp;

public class RBTree {
	public class RBNode {
		String word;
		RBNode parent;
		boolean isRed;
		RBNode left, right;
		
		public RBNode(String word, RBNode parent) {
			this.word = word;
			this.parent = parent;
			isRed = true;
			left = right = null;
		}
		
		public RBNode(String word, RBNode parent, boolean isRed) {
			this.word = word;
			this.parent = parent;
			this.isRed = isRed;
			left = right = null;
		}
	};
	
	private RBNode root;
	
	public RBTree() {
		root = null;
	}

	public void insert(String word) {
		if (root == null) {
			root = new RBNode(word, null, false);
		}
	}
	
	public void checkWord(String word) {
		
	}
	
	private void rrotate(RBNode top) {
		if (top==null) {
			return;
		}
		
		RBNode newTop = top.left;
		top.left = newTop.right;
		newTop.right = top;
	}
	
	private void lrotate(RBNode top) {
		if (top==null) {
			return;
		}
		
		RBNode newTop = top.right;
		top.right = newTop.left;
		newTop.left = top;
	}
}
