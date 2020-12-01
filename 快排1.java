public class Sort{
	public static void QuickSort(int[] array){
		QuickSortHelper(array,0,array.length-1);

	}
	public static void QuickSortHelper(int[] array,int left,int right){
		if(left >= right){
			return;
		}

		int index = find(array,left,right);
		QuickSortHelper(array,left,index -1);
		QuickSortHelper(array,index + 1,right);

	}	

	public static int find(int[] array,int left,int right){
		int val = array[right];
		int low = left;
		int high = right;

		while(low < high){

			while(low < high && array[low] <= val){
				low++
			}
			while(low < high && array[high] >= val){
				high--;
			}
			if(low < high){
				swap(array,low,high);
			}
		}

		swap(array,low,right);
		return low;
	}

}
