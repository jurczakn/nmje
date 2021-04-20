package com.eintern.ex1;




public class Test {

	public static void main(String[] args) {
	
		
		System.out.println("Begin main...");
		Thread t  = Thread.currentThread();
		
		
		try{
		Thread.sleep(1000);
		}catch(Exception ex){
			ex.getMessage();
		}
		
		System.out.println ("Thread name : " + t.getName ( ) );
		
		
	}

}
