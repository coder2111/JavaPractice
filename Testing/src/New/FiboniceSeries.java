package New;

import java.util.Scanner;

public class FiboniceSeries {
public static void main(String args[]) {
	int a=0,b=1,c;
	System.out.println("how many fibonice number you want");
	Scanner sc= new Scanner(System.in);
	int g=sc.nextInt();
	System.out.println(a+"\n"+b);
	for(int f=0;f<g-2;f++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	
	}
}
}
