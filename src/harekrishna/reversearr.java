package harekrishna;
import java.util.Scanner;
public class reversearr {
public static int[] reverse(int arr[]) {//start and end are swappwed and incremented,while loop will be used to put the condition that start and end dont cross eachj other and exceed midpoint 
	//very important mark the method type in previous line ie int[]
	int start=0;
	int temp=0 ;
	int end=arr.length-1;
	while(start<end) {//temp=a,a=b,b=temp
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	return arr;

}
/*public static int[] reverse2(int arr[]) {
	int temp=0;
	int n=arr.length;
	for(int i=0;i<n-i-1;i++) {
		
	temp=arr[i];
	arr[i]=arr[n-i-1];
	arr[n-i-1]=temp;
		
	}
	return arr;
}
*/
public static void printarr(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(" "+arr[i]);
}
}
public static void main(String args[]) {
	
	System.out.println("Enter the size of array");
	Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n];
	System.out.println("enter array elements");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	reverse(a);//a[] gives error because arg type already there in function definition
	//reverse2(a);
	printarr(a);
}
}
//in this method we shall swap the ith and n-ith element,incrementation happens with i