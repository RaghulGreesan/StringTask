package StringTask;
abstract class Maths{
	abstract void add();
	abstract void mul();
}
 class AbstractEx extends Maths {
	void add() {
		System.out.println(10+20);
	}
	void mul() {
		System.out.println(20*2);
	}

	public static void main(String[] args) {
		AbstractEx obj=new AbstractEx();
		obj.add();
		obj.mul();

	}

}
