//check whether a string is a palindrome or not
package harekrishna;
import java.util.Scanner;

public class palindrome {
	public static boolean isPalindrome(String word) {//here we are using a boolean function that can return either true or false
		//also the data type string is used
	char[] charArray=word.toCharArray();//this converts the string into an array containing characters named charArray
	int start=0;
	int end=word.length()-1;
	
	while(start<end) {
	if(charArray[start]==charArray[end]) {
		start++;
		end--;
		return true;//this will return true after each iteration and after the final iteration also if the if is true
		}
	else {
		return false;
		 }
		
	}
	return true;
}
	
	public static void main (String args[]) {
		System.out.println("Enter the string to check if it is a palindrome");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//here we create an instance pal of the class palindrome
		if(isPalindrome(str)) {
			System.out.println("String is a palindrome");
	    }
		else {
			System.out.println("string is not a palindrome");
		}
	}
	
}


