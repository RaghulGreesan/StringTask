package StringTask;

public class Unboxing {

	public static void main(String[] args) {
		int a=10;
		Integer i= Integer.valueOf(a);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
	}

} 
