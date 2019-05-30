package models;

import java.io.Serializable;

public class Chip implements Serializable{

	private int value;

	public Chip(int value) {
		setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
