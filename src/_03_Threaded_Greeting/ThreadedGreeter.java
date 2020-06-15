package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{
	int val;
	
	ThreadedGreeter(int val){
		this.val = val;
	}
	
	@Override
	public void run() {
		System.out.println("Hello from thread number: " + val);
		if(val < 50) {
			new Thread(new ThreadedGreeter(val + 1)).start();
		}
	}

}
