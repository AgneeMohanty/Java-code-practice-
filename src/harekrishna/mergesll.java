package harekrishna;

public class mergesll {
private ListNode head;
private static class ListNode{
	
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
		
	}
	
	
}
public void display() {//this display lies within the mergesll class
	ListNode current=head;
	while(current!=null) {
		System.out.print(current.data+"------>");
		current=current.next;
	}
	System.out.println("null");//after it exits while loop because of encountering null
	System.out.println();
}
	

public static void main (String args[]) {
	mergesll s1 = new mergesll();
	s1.head= new ListNode(10);
	ListNode first= new ListNode(12);
	ListNode second = new ListNode(14);
	
	s1.head.next=first;
	first.next=second;
	
	
	
	
  s1.display();
}
}
