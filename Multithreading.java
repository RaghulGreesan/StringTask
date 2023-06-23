package StringTask;

public class Multithreading extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("running‍");
			
		}
	}
		public void m1()
		{
		for(int i=0;i<5;i++)
		{
			System.out.println("shooting");
			
			
	}
		}
		public void load() throws InterruptedException {
			for(int i=0;i<4;i++) {
				System.out.println("loading....");
				Thread.sleep(5000);
			}
		}
		
	public static void main(String[] args) throws InterruptedException  {
		
		Multithreading obj=new Multithreading();
		obj.run();
		obj.join();
		obj.m1();
		obj.load();
		
	}

}
