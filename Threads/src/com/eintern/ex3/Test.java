package com.eintern.ex3;



public class Test {

	public static void main(String[] args) {
		
		//Get an instance of the thread's job.
		Runnable greet = new Greet();
		
		//Create a Thread instance using the Thread constructor.
		Thread td = new Thread(greet);	//Give it a task
		td.setName("Greeter");			//Give it a name
		
		//Create a new thread of execution
		td.start();						//Get going!
		
	}

}
