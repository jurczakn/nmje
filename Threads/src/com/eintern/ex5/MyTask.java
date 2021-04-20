package com.eintern.ex5;


public class MyTask implements Runnable{

	private Thread thread;

	public void setThread(Thread thread1){
		this.thread = thread1;
	}


	public void run() {
		try{
			if(!Thread.currentThread().equals(thread) && thread.isAlive()){
				thread.join();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
			for(int i=1; i<10; i++){
				
				System.out.println(Thread.currentThread().getName());
			}

		System.out.println("Preparing to be terminated...");

	}	
}
