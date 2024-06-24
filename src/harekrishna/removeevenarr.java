//remove even numbers from the array
package harekrishna;
import java.util.*;
public class removeevenarr {

	public static void printarr(int[] b) {//had to change all methods to static
	System.out.println(" the array after removing even numbers is");
	for( int i=0;i<=b.length-1;i++) {
		System.out.println(" "+b[i]);
			}
}


		
	public static int[] removeEvenarr(int a[]) {
		int size=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0) {
				size++;//this will give size of the odd no array
			}
		
		}
		int[] result=new int[size];
		int k=0;	
		//there is no way of knowing the size of the even number array before initialising the array for taking away the elements
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0) {
					result[k]=a[i];//here b [i] couldnt be done because the sizre of a and b arent same, so a[5] may be there but b may be there only till size 3.
					k++;
				
			}
			}
		return result;
		
		
	
}


public static void main(String args[]) {
	//in this array we use size of array less than equal to size-1 or n-1 because the index starts ftrom 0 ,if we start from 1 then we can go till normal siuze

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the size of the array");
	int n=sc.nextInt();
	int a[]= new int[n];// this cant be initialised before getting n as it returns null pointr exception
	System.out.println("Enter the array elements");
	for(int i=0; i<=n-1;i++) {//cant be <=n or <n as it gives out of bound exception
		a[i]=sc.nextInt();
			}
	 int[] k=removeEvenarr(a);
	 printarr(k);
	
}
}