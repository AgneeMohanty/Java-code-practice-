package harekrishna;

public class min {
public static int minelement(int[] arr) {
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		
	}
	return min;
	}

public static void printarr(int[] arr) {
	for (int i=0;i<arr.length;i++) {
		System.out.println(" "+arr[i]);
	}
}

public static void main (String args[]) {
	int[] a= {1,2,45,3,4,2,4,55,90};
	/*int result=minelement(a);
	System.out.println(result);

*/
	System.out.println(minelement(a));//very important
}
}