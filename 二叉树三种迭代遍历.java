//迭代先序
public void prevOrder(Node root){
	if(root == null){
		return;
	}
	Stack<Node> stack = new Stack<>();
	stack.push(root);
	while(!stack.isEmpty()){

		Node top = stack.pop();
		System.out.println(top.val);

		if(top.right != null){
			stack.push(top.right);
		}
		if(top.left != null){
			stack.push(top.left);
		}

	}

}

//迭代中序
public void midOrder(Node root){
	if(root == null){
		return;
	}
	Stack<Node> stack = new Stack<>();
	Node cur = root;
	while(true){
		while(cur != null){
			stack.push(cur);
			cur = cur.left;
		}
		if(stack.empty()){
			break;
		}

		Node top = stack.pop();
		System.out.println(top.val);
		cur = top.right;

	}
}

//迭代后序
public void poOrder(Node root){
	if(root == null){
		return;
	}

	Stack<Node> stack = new Stack<>();
	Node cur = root;
	Node prev = null;
	while(true){
		while(cue != null){
			stack.push(cur);
			cur = cur.left;
		}

		if(stack.empty()){
			break;
		}
		Node top = stack.peek();
		if(top.right == null || top.right == prev){
			stack.pop();
			System.out.printlin(top.val);
		}else{
			cur = top.right;
		}
	}
}

