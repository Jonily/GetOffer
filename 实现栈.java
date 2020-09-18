//基于顺序表的栈
public class MyStack{
	public int [] vals = new int[100];
	public int size = 0;

	//入栈
	public void push(int val ){
		vals[size] = val;
		size++;
	}

	//出栈
	public int peak(){
		if(size <= 0){
			return null;
		}
		int ret = vals[size - 1];
		size--;
		return ret;
	}

	//取栈顶
	public int pop (){
		if(size <= 0){
			reyurn null;
		}
		int ret = vals[size - 1];
		return ret;
	}
}

//基于链表的栈
public class MyStack{
	static class Node{
		private int val;
		private Node next;

		public Node(int val){
			this.val = val;

		}

	}

	Node head = new Node(-1);

	//入栈
	public void push(int val){
		Node newnode = new Node(val);
		newnode.next = head.next;
		head.next = newnode; 
	}

	//出栈
	public int peak(){
		if(head.next == null){
			return null;
		}
		Node node = head.next;
		int ret = node.val;
		head.next = node.next;
		return ret;

	}

	//取栈顶
	public int pop(){
		if(head.next == null){
			return null;
		}
		int ret = head.next.val;
		return ret;
	}
}