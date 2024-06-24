//wap to find the msssing number in an array containing all natural numbers upto n. Not necesarily in order. 
package harekrishna;

public class missingnum {
public static int missnum(int[] arr) {
	int n=arr.length+1;//n is the limit upto which natural numbers can be present for example 1,2,4
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	
	int num=((n*(n+1))/2)-sum;
	return num;
}

public static void main (String args[]) {
	int[] arr= {1,8,7,4,3,6,2};
	int result=missnum(arr);
	System.out.println("The missing number is "+ result);
	
}
}
