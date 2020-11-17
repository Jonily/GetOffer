public class Treee{
	class Node{
		public int key;
		public int val;
		Node left;
		Node right;

		public Node(int key,int val){
			this.key = key;
			this.val = val;
		}
	}
	public Node root = null;
	//查找
	public Node find(int key){
		Node cur = root;
		while(cur != null){
			if(key < cur.key){
				cur = cur.left;
			}else if(key > cur.key){
				cur = cur.right;
			}else{
				return cur;
			}
		}
		return null;
	}

	//插入
	public Node insert(int key,int val){
		if(root == null){
			root = new Node(key,val);
			return root;
		}

		Node cur = root;
		Node prev = null;
		while(cur != null){
			if(cur.key > key){
				prev = cur;
				cur = cur.left;
			}else if(cur.key < key){
				prev = cur;
				cur = cur.right;
			}else{
				cur.val = val;
				return cur;
			}
		}

		Node node = new Node(key,val);
		if(node.key < prev.key){
			prev.left = node;
		}else{
			prev.right = node;
		}

		return node;
	}

	//删除
	public void removeNode(Node cur,Node parent){
		if(cur.left == null){
			if(cur == root){
				root = cur.right;
			}else if(cur = parent.left){
				parent.left = cur.right;
			}else if(cur = parent.right){
				parent.right = cur.right;
			}
		}else if(cur.right == null){
			if(cur == root){
				root = cur.left;
			}else if(cur = parent.left){
				parent.left = cur.left;
			}else if(cur = parent.right){
				parent.right = cur.left;
			}
		}else{

			Node goat = cur.right;
			Node goatParent = cur;

			while(goat.left != null){
				goatParent = goat;
				goat = goat.left;
			}

			cur.key = goat.key;
			cue.val = goat.val;
			if(goat == goatParent.left){
				goatParent.left = goat.right;
			}else{
				goatParent.right = goat.left;
			}
		}
	}
}