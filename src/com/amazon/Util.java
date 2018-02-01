package com.amazon;

public class Util {
  
	public static void myAssert(String exp, String act){
		
		if (!exp.equals(act)) {
			throw new RuntimeException("expected "+ exp + " but found " + act);
		}		
	}
	
	
}
