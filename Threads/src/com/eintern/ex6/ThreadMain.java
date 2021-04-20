package com.eintern.ex6;



public class ThreadMain {


	public static void main(String[] args) {

		ThreadSumCalc tscalc = new ThreadSumCalc();
		tscalc.start();

		synchronized(tscalc){
			try{
				System.out.println();
				tscalc.wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}

			System.out.println("Total is : " + tscalc.getSum());

		}

	}

}
