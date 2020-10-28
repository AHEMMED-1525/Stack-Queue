package Stack.Queue;

public class MyStack <K>{
	private final MyLinkedList myLinkedList;
	
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	// Push the stack
	public void push(INode myNode) {
		myLinkedList.add(myNode);
		
	}

	//Peak method
	public INode peak() {
		return myLinkedList.head;
		
	}
	//Pop Method
	public INode pop() {
		return myLinkedList.pop();
	}
	
	public boolean isEmpty() {
		return myLinkedList.isEmpty();
	}

}
