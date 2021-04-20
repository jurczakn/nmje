package producer.consumer;

import java.util.Vector;


//The Producer/Consumer Problem
//Running the synchronized version of this program will force you to shut down eclipse
//and kill the process in your task manager in order to stop the program.

public class Test {
	
	//The globally usable data buffer, a vector, which is technically "thread safe"
	//out-of-the-box.
	public static Vector<Object> data = new Vector<Object>();
	 
	
    public static void main(String[] args) {
    	
        Thread producer = new Producer();
        Thread consumer = new Consumer();
        
        producer.start();
        consumer.start();
      
    }
}
