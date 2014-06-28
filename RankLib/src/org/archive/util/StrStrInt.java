package org.archive.util;

import java.io.Serializable;

public class StrStrInt extends Triple<String, String, Integer> implements Serializable {
	private static final long serialVersionUID = 8683452581122832185L;
	
	public StrStrInt(String strFirst, String strSecond, Integer intThird){
		super(strFirst, strSecond, intThird);
	}
	//
	public void upThird(int deltaInt){
		this.third += deltaInt;
	}
}
