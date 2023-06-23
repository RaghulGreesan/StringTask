package StringTask;

 class th1 extends Thread{
public void run() {
	for(int i=0;i<=5;i++) {
		System.out.println(i+"th1");
	}
}
}
 class th2 implements Runnable{
	 public void run() {
		 for(int i=6;i<=10;i++) {
			 System.out.println(i+"th2");
		 }
	 }
 }
 class th3 extends Thread{
	 public void run() {
		 for(int i=11;i<=15;i++) {
			 System.out.println(i+"th3");
		 }
	 }
 }
 class MtEx {
	 public static void main(String args[]) {
		 th1 ob1=new th1();
		 ob1.start();
		 th2 ob2=new th2();
		 Thread th=new Thread(ob2);
		 th.start();
	 }
 }
