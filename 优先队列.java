public class MyProtyQueue{
	private int[] array = new int[100];
	private int size = 0;

	public void offer(int val){
		array[size] = val;
		size++;

		//向上调整
		shiftUp(array,size,size - 1);


	}
	public void shiftUp(int[] array,int size,int index){
		int child = index;
		int parent = (child - 1)/2;

		while(child > 0){

			if(array[child] > array[parent]){
				int tmp = array[parent];
				array[parent] = array[child];
				array[child] = tmp;
			}else{
				break;
			}

			child = parent;
			parent = (child - 1)/2;
		}
	}

	public Integer poll(){
		if(size == 0){
			return null;
		}

		int ret = array[0];
		array[0] == array[size - 1];

		size--;

		shfitDown(array,size,0);

		return ret;
	}

	public void shfitDown(int[] array,int size,int index){

		int parent = index;
		int child = 2*parent +1;

		while(child < size){

			if((child + 1) < size && array[child + 1] > array[parent]){
				child = child +1;
			}else{
				break;
			}

			parent = child;
			child = 2*parent + 1;
		}

	}

	public Integer peek(){
		if(size == 0){
			return null;
		}

		return array[0];
	}

	public boolean isEmpty(){
		return size ==0;
	}



}

