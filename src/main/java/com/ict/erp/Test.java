package com.ict.erp;

class Init{
	
	
}
public class Test {
	
	private Init i;
	//test
	public Test() {
		
	}
	
	public Init getInit() {
		i = new Init();
		return i;
	}
	public void close() {
		this.i = null;
	}
	
	public void printI() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		Init i = t.getInit();
		t.close();
		i = null;
		System.out.println(i);
		t.printI();
	}
}
