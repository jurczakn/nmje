package com.eintern.ex4;


public class Test {

	public static void main(String[] args) {
		
		Greet greet = new Greet();
		Thread td = new Thread(greet);
		td.setName("Greeter");	//Give it a name
		
		td.start();
		
	}

}
