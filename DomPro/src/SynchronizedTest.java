


public class SynchronizedTest{
	

	public static synchronized void main(String[] args){
		try {
			Thread t = new Thread(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					sogou();
				}
				
			};
			t.start();
			System.out.println("main");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	static synchronized void sogou(){
		System.out.println("sogou");
	}
}

