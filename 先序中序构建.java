public int index = 0;
public TreeNode buildTree(int[] preOrder,int[] inOrder){
	index = 0;
	return buildeTreeHelper(preOrder,inOrder,0,inOrder.length);
} 

public TreeNode buildTreeHelper(int[] preOrder,int[] inOrder,int inOrderLeft,int inOrderRight){
	if(inOrderLeft >= inOrderRight){
		return null;
	}
	if(index >= preOrder.length){
		return null;
	}

	TreeNode node = new TreeNode(preOder[index]);
	int pos = find(inOrder,inOrderLeft,inOrderRight,node.val);
	index++;
	node.left = buildTreeHelper(preOrder,inOrder,inOrderLeft,pos);
	node.right = buildTreeHelper(preOrder,inOrder,pos+1,inOrderRight);
	return node;

}

public int find(int[] inOrder,int inOrderLeft,int inOrderRight,int val){
	for(int i = inOrderLeft; i < inOrderRight; i++){
		if(inOrder[i] == val){
			return i;
		}
	}
}


public int index = 0;
public TreeNode buildTree(int[] preOrder,int[] inOrder){
	index = 0;
	return(buildTreeHelper(preOrder,inOrder,0,inOrder.length));
}

public TreeNode buildTreeHelper(int[] preOrder,int[] inOrder,int inOrderLeft,int inOrderRight){
	if(inOrderLeft >= inOrderRight){
		return null;

	}
	if(index >= preOrder.length){
		return null;
	}

	TreeNode node = new TreeNode(preOrder[index]);
	int pos = find(inOrder,inOrderLeft,inOrderRight,node.val);
	index++;
	node.left = buildTreeHelper(preOrder,inOrder,inOrderLeft,pos);
	node.right = buildTreeHelper(preOrder,inOrder,pos+1,inOrderRight);
	return node;

}

public int find(int[] inOrder,int inOrderLeft,int inOrderRight,int val){
	for(int i = inOrderLeft; i < inOrderRight;i++){
		if(inOrder[i] == val){
			return i;
		}
	}
}
