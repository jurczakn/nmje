package producer.consumer;

import java.util.Iterator;


public class Consumer extends Thread {
	
    public void run() {
    	
    	//Infinite loop
        for (;;) {
            try {
                Thread.sleep(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
           
            //Synchronized code block
            synchronized(Test.data){
            Iterator<Object> it = Test.data.iterator();
            while (it.hasNext())
            	System.out.println("Consuming data...");
                it.next();
            }
            
            
        }
    }
}
