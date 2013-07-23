package com.qsoft.longdt;

import junit.framework.TestCase;

public class SingleLinkedListTest extends TestCase {

	// Step 1
	public void testCreateNewLinkListWithEmptyList() {
		SingleLinkedList linkedList = new SingleLinkedList();
		assertEquals(0, linkedList.size());
	}
}
