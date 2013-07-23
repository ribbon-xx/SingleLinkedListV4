package com.qsoft.longdt;

import java.util.ArrayList;

import junit.framework.TestCase;

public class SingleLinkedListTest extends TestCase {

	private ArrayList<Node> strArray;

	private String newStr;

	private Node nodeAnchor;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		strArray = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Node node = new Node();
			node.setNode("String " + i);
			int nextIndex = i < 4 ? i + 1 : -1;
			int prevIndex = i > 0 ? i - 1 : -1;
			node.setNextNodeIndex(nextIndex);
			node.setPrevNodeIndex(prevIndex);
			strArray.add(node);
		}

		nodeAnchor.setNode("String 2");
		nodeAnchor.setNextNodeIndex(2);
		nodeAnchor.setPrevNodeIndex(0);

		newStr = "New Strings With Random Position Per Test";
	}

	// Step 1
	public void testCreateNewLinkListWithEmptyList() {
		SingleLinkedList linkedList = new SingleLinkedList();
		assertEquals(0, linkedList.size());
	}

	// Step 2
	public void testCreateNewLinkListWithObjectList() {
		SingleLinkedList list = new SingleLinkedList(strArray);
		assertEquals(strArray, list.getList());
	}

	// Step 3
	public void testGetSizeOfLinkList() {
		SingleLinkedList list = new SingleLinkedList(strArray);
		assertEquals(strArray.size(), list.size());
	}

	//Step 4
	public void testInsertAfterIndexN() {
		SingleLinkedList list = new SingleLinkedList(strArray);
		Node nodeInsert = new Node();
		nodeInsert.setNode(newStr);

		list.insertAfter(nodeAnchor, nodeInsert);
	}
}
