package producer.consumer;



public class Producer extends Thread {

	public void run() {
		
		//Infinite loop
		for (;;) {
			
			try{
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Test.data.add(new Object());
			if (Test.data.size() > 1000)
				Test.data.remove(Test.data.size() - 1);
		}
	}
}



