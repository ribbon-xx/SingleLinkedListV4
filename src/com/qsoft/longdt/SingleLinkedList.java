package com.qsoft.longdt;

import java.util.ArrayList;

public class SingleLinkedList {

	private ArrayList<Node> listObject;

	public SingleLinkedList() {
		listObject = new ArrayList<Node>();
	}

	public SingleLinkedList(ArrayList<Node> strArray) {
		listObject = new ArrayList<Node>();
		listObject.addAll(strArray);
	}

	public int size() {
		return listObject.size();
	}

	public Object getList() {
		return null;
	}

}
