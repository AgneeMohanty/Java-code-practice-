package harekrishna;
/*in this program we will move all zeroes to the end of the array
process-i will keep track of zero elements from start and j of non zero elements from end ,i and j will be swapped only when i is zero and j not zero and then incremented and decremented accordingly
*/
public class zerotoright{
	public static int[] zerotoend(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
		if(arr[i]==0 && arr[j]!=0) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		i++;
		j--;
		}
		if(arr[i]!=0) {
			i++;
		}
		if(arr[j]==0) {
			j--;
		
			
		}
		}	
	return arr;
	}
		
public static void main (String args[]) {
	int[] b={0,0,5,6,0,7,8,9,3};

	zerotoend(b);
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);//	[I@515f550a is output if we print sysout(b) directly after function call
	}

}
	
	
}
