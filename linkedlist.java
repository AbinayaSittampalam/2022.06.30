public class linkedlist
{
	public Node head=null;
	public Node tail=null;
	
		class Node
		{
			Node next;
			int data;
			
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		}
		public void addNode(int data)
		{
			Node newNode=new Node(data);
			
			if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else{
				tail.next=newNode;
				tail=newNode;
			}
		}
		public void insertAt(int data,int position)
		{
			Node newNode=new Node(data);
	
			Node next=null;
			
			
         if(head == null){
             head = newNode;
		 }
		 
	
		else if(position == 0){
            newNode.next = head;
            head = newNode;
           
            }
			
	    else
		{
         Node cur = head;
         for(int i=0; i<position-1; i++){
            cur = cur.next;
             }
         
    	  newNode.next = cur.next;
          cur.next = newNode;
        
        }
		}
		
		public void deleteAt(int position)
		{
		Node cur=head;
			if(head == null){
				System.out.println("cant delete");
			}
			else if(position==0)
			{
				
				head=cur.next;
			}
			else{
				 for(int i=0; i<position-1; i++){
            cur = cur.next;
			
             }
         
    	 cur.next=cur.next.next;
        
			}
		}
		public void search(int data)
		{
			
			Node cur=head;
			int index=0;
			while(cur !=null)
			{
				if(cur.data==data)
				{
				System.out.println(index);
				
				
				}
				cur=cur.next;
				index ++;
			}
		}
		public void display()
		{
			Node current=head;
			if(head == null){
				System.out.println("list is empty");
				return;
			}
			while(current != null){
				System.out.print(current.data +" ");
				current=current.next;
				
			}
			System.out.println();
			
		}
		
}
	
class main
	{
		
	
	public static void main(String args[])
	{
	
	linkedlist list1=new linkedlist();
	list1.addNode(5);
	list1.addNode(1);
	list1.addNode(3);
	list1.addNode(8);
	list1.addNode(2);
	list1.display();
	list1.insertAt(4,3);
	list1.display();
	list1.insertAt(11,2);
	list1.display();
	list1.insertAt(9,0);
	list1.display();
	list1.deleteAt(3);
	
	list1.deleteAt(0);
	list1.display();
	list1.search(4);
	
	}
	}
	
