package com.eintern.ex6;

public class ThreadSumCalc extends Thread{

	private int sum;

	public int getSum() {
		return sum;
	}

	public void run(){

		synchronized(this){
			for (int i = 0; i<100; i++){ 
				sum = sum + i;
			}
			notify();	 
		}
	}

}
