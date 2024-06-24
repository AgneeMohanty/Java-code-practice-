package harekrishna;

public class secondmax {
public static int secmax(int arr[]) {
	int max= Integer.MIN_VALUE;
	int secndmax=Integer.MIN_VALUE;//these return the smallest integer value that is-241425616 something so that it can be compared
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			secndmax=max;//first value of max is transferred to max and then new value is brought onto max
			max=arr[i];
		}
		else if(arr[i]!=max && arr[i]>secndmax) {
			secndmax=arr[i];
		}
		
	
	
	}
	return secndmax;
}
public static void main (String args[]) {
	int[] a= {2,4,5,3,4,56,75,33};
	System.out.println("Second maximum element is "+secmax(a));
	
	
}
}
