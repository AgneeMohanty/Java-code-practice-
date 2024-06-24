package harekrishna;



	public class Singlelinkedlist{
		private ListNode head;
		
		private static class ListNode{
			private int data;//generic data type
			private ListNode next;

			public ListNode(int data) {
				this.data=data;
				this.next=null;
			}
		
	
	}
		public void display() {
			ListNode current=head;
			while(current!=null) {
				System.out.print(current.data+"----->");
				current=current.next;
			}
			System.out.println("null");
		}
		
		 public void count() {
			int count=0;
			ListNode current=head;
			while(current!=null) {
				count++;
				current=current.next;
			}
			System.out.println(count);
		}
		public void addnodetobeginning(int data) {
			ListNode newNode = new ListNode(data);//new node created with next pointin to null
			newNode.next=head;//next points to head of existing node instead of null
			head=newNode;//head now moves to first block of newly created node
		}
		public void addnodetoend(int data) {
			ListNode newNode=new ListNode(data);//new listnode with name newNode created with value or data as given in function call argument
			if(head==null) {//if theres no node and the node added is the first one then before it head must be null
				head=newNode;
			return;
			}
			ListNode current=head;
			while(current.next!=null) {
				current=current.next;//this means current will be moved till firstblock of end node
			}
			current.next=newNode;//the next of the last current will point to newnode block
		}
		public void addnodeatposition(int position,int data) {
			ListNode newNode= new ListNode(data);
			if(position==1) {
				newNode.next= head;//next points to first node in list
				head=newNode;//head come to firt block of newnode
			}//if will be executed only when the positin is 1
			ListNode previous=head;
			int count=1;
			
				while(count<position-1) {
					previous=previous.next;
					count++;
				}//at this point the pointer previous has come to the location aftr which we need to insert node,just the link remain to be broken
		ListNode current=previous.next;//previous next pointed to the node to which current points just as a pointer
		previous.next=newNode;//previous next now points to the new node
		newNode.next=current;//and the next of newnode now points rto the current or where previously the previous.next pointed
		}
				
		 public  ListNode deletefirstnode() {
			 if(head==null) {//there is no node in the list to delete
				 return null;
			 }
			 else {
				 ListNode temp=head;//here we use temp in place of current ,so tem[p and current are just temporary pointers used to point to the current node or help in swapping 			 }
				 head=head.next;//head now points to next node
				 temp.next=null;//now the first node doesnt point to the secnd anymore
				 //the last step wont have been possible wihout ctrating a temporary node as head position has already changed
			return temp;
			 }
			 }
		 public ListNode deletelastnode() {
			 if(head==null||head.next==null) {//no node in linked list
				 return head;
			 }
			 ListNode current=head;
			 ListNode previous=null;
			 while(current.next!=null) {
				 previous=current;
				 current=current.next;
			 }//after the last iteration of while loop when current.next is null the previous points to the node before last node
			 
			 previous.next=null;//link to last node is broken
			 return current;
		 }
		public void deletenodeatposition(int pos) {
			if(pos==1) {
				head=head.next;//head simply moves to the next node,and the first node moves to garbage
			}
			else {//we will use the previous pointers like in add node to bring the pointer to the node before the node to be deleted
				ListNode previous=head;
				int count=1;
				while(count<pos-1) {//same as in addnode
					previous=previous.next;
					count++;
					
				}
			
			ListNode current=previous.next;//now current points to the required node
			previous.next=current.next;//instead of pointing to the next node previous now points to the node after it,as a result the link with the node is broken
			}
		}
		public  boolean searchelement(int key) {
			ListNode current=head;
			while(current!=null) {
				if(current.data==key) {
				return true;
				}//if the if condition isnt true then it will executr the below line and check for while condition
					current=current.next;
		}
			return false;//if if condition never returns true then while will return fslse
		}
		public ListNode  reversesinglelinkedlist(ListNode head) {
			ListNode current=head;
			ListNode previous=null;
			ListNode next=null;
			
			while(current!=null	) {
				next=current.next;//next points to the node after current or curremt next
				current.next=previous;//current next instead of pointing forward points to the previous node
				previous=current;//previous now moves to current  position 
				current=next;//current points to current next from where it will link back to previous at next iteration of while, here the use of next comes as 
			}
			return previous;
		}
		public  ListNode findmidnode() {
			ListNode slowptr=head;
			ListNode fastptr=head;
			while(fastptr!=null && 	fastptr.next!=null) {
				slowptr=slowptr.next;
				fastptr=fastptr.next.next;
			}
			return slowptr;
		}
		public ListNode nthnodefromend(int n) {
			ListNode refptr=head;
			ListNode mainptr=head;
			int count=0;
			while(count<n) {
				refptr=refptr.next;
				count++;
			}
			while(refptr!=null) {
				refptr=refptr.next;
				mainptr=mainptr.next;
			}
			return mainptr;
			}
		public void removeduplicatesfromsortedlinkedlist() {
			ListNode current=head;
			while(current!=null && current.next!=null) {
				if(current.data==current.next.data) {
					current.next=current.next.next;
				}
				else {
					current=current.next;
					}
				}
		}
		public void addnewnodetosortedlist(int data) {
			ListNode current=head;
			ListNode temp=null;
			ListNode newnode = new ListNode(data);
			while(current!=null && current.data< newnode.data) {
				temp=current;
				current=current.next;
				
			}	//after this point temp and current wwill be previous and nextnode of the new node repectively
			newnode.next=current;
			temp.next=newnode;
		
			}//linking part

		public void removeKey(int key) {
			ListNode current=head;
			ListNode temp=null;
			if(current.data!=key|| current.next!=null) {
				temp=current;
				current=current.next;//temp stays one block before current
			}
			if(current==null) {
				return;//if no keyis  found
				
			}
			temp.next=current.next;//link is broken as previous node instead of pointing to the node after it that is current points to currentnext
		}
		public void createaloopedlinkedlist() {
			Singlelinkedlist sll=new Singlelinkedlist();
			sll.head=new ListNode(10);
			ListNode first=new ListNode(1);
			ListNode second=new ListNode(2);
			ListNode third=new ListNode(3);
			ListNode fourth=new ListNode(4);
			ListNode fifth=new ListNode(5);
			ListNode sixth=new ListNode(6);
			
			head=first;
			first.next=second;
			second.next=third;
			third.next=fourth;
			fourth.next=fifth;
			fifth.next=sixth;
			sixth.next=third;
		}
		public boolean loopinsll() {
			ListNode slowptr=head;
			ListNode fastptr=head;
			while(fastptr!=null && fastptr.next!=null ) {
				slowptr=fastptr;
				fastptr=fastptr.next.next;
			}
			if(slowptr==fastptr) {//due to presence of a loop a situation will come after turninground and round at some time slow and fastptr will be same.
				return true;
			}
			return false;
		}
		private ListNode findstartingpointofloop() {
			ListNode fastptr=head;
			ListNode slowptr=head;
			if(fastptr!=null && fastptr.next!=null ) {
				slowptr=fastptr;
				fastptr=fastptr.next.next;
			}
			if(slowptr==fastptr) {//condition for loop is true
				return startinglooppoint(slowptr);
			}
			return null;
		}
			
			private ListNode startinglooppoint(ListNode slowptr) {
				ListNode temp=head;
				while(temp!=slowptr) {//this is a formula,ehen tem[p becomes equal to slowptr then it is pointng to dtsartingpoint
					temp=temp.next;
					slowptr=slowptr.next;
				}
				return temp;
			}
		public void removeloop() {
			ListNode slowptr=head;
			ListNode fastptr=head;
			while(fastptr!=null && fastptr.next!=null) {
				fastptr=fastptr.next.next;
				slowptr =slowptr.next;
			}
			if(slowptr==fastptr) {
				removingloop(slowptr);
				return;
				}
			}
			
		private void removingloop(ListNode slowptr) {
			ListNode temp=head;
			while(slowptr.next!=temp) {//here we use the condition slowptr.next instead of slowptr to bring slowptr to a node before the temp i.e just before the starting point so that we can break the loop
				temp=temp.next;
				slowptr=slowptr.next;
			}
			slowptr.next=null;
			}
		
		
	public static void main(String[] args) {
		Singlelinkedlist sl=new Singlelinkedlist();
		sl.head=new ListNode(10);//head is an instance of sl and listnode(10) is in the format of listnode(data)
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(11);
		ListNode fourth=new ListNode(15);
		//listnodes with data values are created ,now we need to connect them
		sl.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sl.display();
		sl.count();
		sl.addnodetobeginning(1);
		sl.display();
		sl.addnodetoend(12);
		sl.display();
		sl.addnodeatposition(5, 13);
		sl.display();
		sl.deletefirstnode();
		sl.display();
		sl.deletelastnode();
		sl.display();
		sl.deletenodeatposition(3);
		sl.display();
		System.out.println((sl.searchelement(15)));
		System.out.println((sl.searchelement(9)));
		//sl.reversesinglelinkedlist(ListNode head);
		sl.display();
		ListNode result=sl.findmidnode();
		System.out.println("middle node is " +result.data);//result.data because result returns the node not the value at it
		ListNode result1=sl.nthnodefromend(3);//listnode result as the func returns a node  
		System.out.println("nth node from end is "+result.data);
		sl.deletefirstnode();
		sl.display();
		sl.addnodeatposition(3, 13);
		sl.display();
		sl.removeduplicatesfromsortedlinkedlist();
		sl.display();
		sl.addnewnodetosortedlist(16);
		sl.display();
		sl.removeKey(13);
		sl.display();
		sl.createaloopedlinkedlist();
		boolean result3=sl.loopinsll();
		System.out.println("is loop present "+result3);
		sl.display();
		sl.removeloop();
		sl.display();
	}
	
}	

