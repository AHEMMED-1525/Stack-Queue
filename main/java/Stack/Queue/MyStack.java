package Stack.Queue;

public class MyStack <K>{
	private final MyLinkedList myLinkedList;
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	public void push(INode myNode) {
		myLinkedList.add(myNode);
		
	}
	public void printStack() {
		myLinkedList.printMyNodes();
		
	}
	public INode peak() {
		return myLinkedList.head;
		
	}

}
