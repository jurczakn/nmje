package com.eintern.ex5;



public class Test {

	public static void main(String[] args) {
		
		MyTask myTask = new MyTask();

		Thread t1 = new Thread(myTask);
		t1.setName("Barney");
		myTask.setThread(t1);
		t1.start();
		
		
		Thread t2 = new Thread(myTask);
		t2.setName("Fred");
		t2.start();
		

		Thread t3 = new Thread(myTask);
		t3.setName("Wilma");
		t3.start();
		
		
		
		
	
	}

}
