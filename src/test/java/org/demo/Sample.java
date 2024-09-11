package org.demo;

public class Sample {

	public void tc1() {
		System.out.println("sample1");
	}

	public void tc2() {
		System.out.println("sample2");
	}

	public void tc3() {
		System.out.println("sample3");
	}
	
	public static void main(String[] args) {
		Sample a = new Sample();
		a.tc1();
		a.tc2();
		a.tc3();
	}

}
