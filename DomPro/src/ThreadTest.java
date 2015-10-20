

public class ThreadTest extends Thread{
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run");
	}

	public static void main(String[] args){
		try {
			ThreadTest t = new ThreadTest();
			t.run();
			System.out.println("main");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class HelloSogou {
	
}
