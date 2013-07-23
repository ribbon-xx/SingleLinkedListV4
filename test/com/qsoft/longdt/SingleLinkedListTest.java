package com.qsoft.longdt;

import java.util.ArrayList;

import junit.framework.TestCase;

public class SingleLinkedListTest extends TestCase {

	private ArrayList<Node> strArray;

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
}
