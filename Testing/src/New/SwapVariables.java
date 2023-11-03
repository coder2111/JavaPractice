package New;

public class SwapVariables {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		System.out.println("using third variable");
		int temp;
		System.out.println("before swap a= " + a + " b= " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swap a= " + a + " b= " + b); 
		System.out.println();
		System.out.println("using + and - and no third variable");
		System.out.println("before swap a= " + a + " b= " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swap a= " + a + " b= " + b); 
		System.out.println();
		System.out.println("using * and / and no third variable");
		System.out.println("before swap a= " + a + " b= " + b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swap a= " + a + " b= " + b);
		System.out.println();
		System.out.println("using xor and no third variable");
		System.out.println("before swap a= " + a + " b= " + b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swap a= " + a + " b= " + b);
	}
}
