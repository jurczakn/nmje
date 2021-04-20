package com.eintern.ex3;



public class Greet implements Runnable{

	//Must provide implementation for the "run" method
	public void run() {
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " thread says: 'Hello'");
		
	}	
	
}
