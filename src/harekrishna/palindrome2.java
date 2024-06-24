package harekrishna;

import java.util.Scanner;

public class palindrome2 {

		public static  boolean isPalindrome(String word) {
			char[] charArray=word.toCharArray();
			int n=charArray.length;
			for(int i=0;i<n;i++) {
				if(charArray[i]==charArray[n-i-1]) {
					return true;
				}
				else {
					return false;
				}
			}
			return false;
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
