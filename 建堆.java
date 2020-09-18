
//向下调整
public static void  shifDown(int[] arrays , int index){
	int parent = index;
	int child = 2*parent + 1;

	while(child < arrays.length()){
		if(child+1 < arrays.length() && arrays[child] < arrays[child+1]){
			child = child +1;

		}

		if(arrays[child] > arrays[parent]){
			int tmp = arrays[parent];
			arrays[parent] = arrays[child];
			arrays[child] = tmp;
		}else{
			break;
		}

		parent = child;
		child = 2*parent+1;
	}

}