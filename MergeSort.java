
public class MergeSort implements SortingAlgorithm{
	
	@Override
	public void sort(int[] a) {
		//base case
		if(a.length == 1)
			return;
		
		int mid =a.length /2;
		int[] left = new int[mid];
		int[] right = new int[a.length- mid];
		System.arraycopy(a, 0, left, 0, mid-1);
		System.arraycopy(a, mid, right, 0, a.length- mid);
		sort(left);
		sort(right);
		merge(left, right, a);
	}
	
	public void merge(int[] left, int[] right, int[] a) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < left.length && j < right.length ) {
			if(left[i] <= right[j])
				a[k++] = left[i++];
			else
				a[k++] = right[j++];
		}
		
		while(i < left.length)
			a[k++] = left[i++];
		
		while(j < right.length)
			a[k++] = right[j++];
	}
	

}

