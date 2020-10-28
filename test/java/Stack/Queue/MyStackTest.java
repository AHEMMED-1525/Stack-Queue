package Stack.Queue;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	@Test
	public void givenValuesWhenAddedToStackShouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);	
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode =  new MyNode<>(70);
		
		MyStack myStack = new MyStack();
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode, peak);
	
	}
}