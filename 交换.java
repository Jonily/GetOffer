public class ChangeSort{
	public void Sort(int[] array){
		for(int bound = 0;bound<array.length;bound++){
			for(int cur = bound + 1; cur < array.length;cur++){
				if(array[bound] < array[cur]){
					swap(array,bound,cur);
				}
			}
		}
	}

	public void swap(int[] array,int bound,int cur){
		int tmp = array[cur];
		array[cur] = array[bound];
		array[bound] = tmp;

	}
}