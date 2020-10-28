package Stack.Queue;

import Stack.Queue.INode;

public class MyLinkedList {
	 public INode tail;
	 public INode head;

	    public MyLinkedList() 
	    {
	        this.head = null;
	        this.tail = null;
	    }
	    //Add method
	   public void add(INode newNode) {
	     if(this.head == null && this.tail == null) 
	     {
	            this.head = newNode;
	            this.tail = newNode;
	     }
	     else 
	     {
	            INode tempNode = this.head;
	            this.head = newNode;        
	            this.head.setNext(tempNode);
	        }
	    }
	   //Append
	   public void append(INode newNode) {
	        if(this.head == null && this.tail == null) {
	            this.head = newNode;
	            this.tail = newNode;
	        }
	        else {
	            this.tail.setNext(newNode);
	            this.tail = newNode;
	        }
	    }
	   //Insert
	    public void insert(INode myNode , INode newNode) {
	        INode tempNode = myNode.getNext();  
	        myNode.setNext(newNode);            
	        newNode.setNext(tempNode);          
	    }
	    //Pop
	    public INode pop() {
	        INode tempNode = this.head;         
	        this.head = head.getNext();         
	        return tempNode;
	    }
	    public INode peek() {
	        return this.head;
	    }
	    //Empty
	    public boolean isEmpty() {
	        if (this.head == null)
	            return true;
	        else
	            return false;

	    }
}
