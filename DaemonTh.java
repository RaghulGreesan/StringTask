package StringTask;
class ThreadExm extends Thread{
	public void run()
{
	for(int i=0;i<=5;i++) {
		System.out.println(i +  " th1");
	}
}
}
public class DaemonTh {
	public static void main(String args[]) throws InterruptedException{
		System.out.println("Hai");
	    ThreadExm obj=new ThreadExm();
	    obj.setDaemon(true);
	    obj.start();
	    System.out.println("Hello");
	    Thread.sleep(2);
	}
}
