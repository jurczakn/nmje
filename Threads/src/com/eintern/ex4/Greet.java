package com.eintern.ex4;



public class Greet extends Thread{
	
	//The thread job
	public void run(){
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " thread says: 'Hello'");
		
	}
	

}
