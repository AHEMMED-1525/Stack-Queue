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
		
	
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode, peak);
	
	}
	@Test
	public void givenValuesWhenPoppedFromStackShouldRemoveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode =  new MyNode<>(70);
		
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		
		INode pop = null ;
		while(!myStack.isEmpty()) {
			pop = myStack.pop();
		}
		Assert.assertEquals(myFirstNode, pop);

	}
}