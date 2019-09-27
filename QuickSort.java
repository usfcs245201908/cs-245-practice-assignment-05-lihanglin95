
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		qs(a,0,a.length-1);

	}
	
	public void qs(int[] a, int left, int right) {
		if(left < right) {
			int p = partition(a, left, right);
			qs(a, left, p-1);
			qs(a, p+1, right);
		}
	}
	
	public int partition(int[] a, int left, int right) {
		//System.out.println("left: " + left + " right: " + right);
		if(left < right) {
			int pivot = left;
			int i = left + 1;
			int j = right;
			while(i < j) {
				while(i < right && a[i] <= a[pivot])
					++i;
				while(j >= i && a[j] > a[pivot])
					--j;
				if(i < j)
					swap(a, i, j);				
			}
			if(a[j] < a[pivot])
				swap(a, j, pivot);
			return j;
		}
		return left;
	}
	
	public void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

}
