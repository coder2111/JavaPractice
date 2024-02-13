package ss;

 class StaticDerived {
	public static  void run() {
		System.out.println("static base class method");
	}
	//overloading
	private void walk() {
		System.out.println("testing overloading for ");
	}

}
public class M7_Static  extends StaticDerived{
	public static void run() {
		System.out.println("static derived class method");
	}
	public static void main(String args[]) {
		StaticDerived obj = new M7_Static();
		StaticDerived.run();
		obj.run();
	}
}
