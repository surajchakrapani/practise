package interviewQuestions;

public class ArrayBasedQuestions {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9};
		int arr[]= {48,11,7,8,0,80,1,6,2};
		System.out.println("Sum of the elements in the Array: " + sumArray(array));
		System.out.println("Element was found at index: " + sequentialSearch(array,16));
		System.out.println("Element was found at index: " + sequentialSearch(array,6));
		System.out.println("Element was found at index: " + sequentialSearch(array,16));
		System.out.println("Element was found at index: " + binarySearch(array,6));
		rotateArray(array,3,array.length);
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		sort1toN(arr,arr.length);
		for(int i = 0; i<array.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	//returns sum of the values given in input array
	public static int sumArray(int array[]) {
		int total =0;
		for (int i:array) {
			total += i;
		}
		return total;
	}
	//Sequential Search:to search for a given value in the array
	public static int  sequentialSearch(int array[],int value) {
		for(int i=0;i<array.length;i++) {
			if(array[i]== value) {
				return i;
			}
		}
		return -1;
	}
	
	//binary Search
	public static int binarySearch(int array[],int value) {
		int low = 0,mid,high=array.length;
		while(low<=high) {
			mid = (low + high)/2;
			if(array[mid]==value) {
				return mid;
			}else if(array[mid]<value) {
					low=mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}
	
	public static void rotateArray(int a[],int n, int k) {
		reverseArray(a,0,k-1);
		reverseArray(a,k,n-1);
		reverseArray(a,0,n-1);
	}
	
	public static void reverseArray(int a[],int start,int end) {
		//looping way 1
		for(int i = start,j = end ; i<j; i++,j--) {
			int temp=a[i];
			a[i] = a[j];
			a[j]=temp;
		}
		//looping way 2
		/*
		 * int li = start; int ri= end;
		 * 
		 * 
		 * while(li<ri) { int temp=a[li]; a[li] = a[ri]; a[ri]=temp;
		 * 
		 * li++; ri--; }
		 */
	}
	
	//SortingOfAnArray
	public static void sort1toN(int[] arr,int size) {
		for(int i=0;i<size;i++) {
			while(arr[i] != i + 1 && arr[i]>1) {
				int temp = arr[i];
				arr[i] = temp -1;
			}
		}
	}
	
}
