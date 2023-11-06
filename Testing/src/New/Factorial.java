package New;

import java.util.Scanner;

public class Factorial {
public static void main(String args[]) {
	System.out.println("Enter a num");
	Scanner sc=new Scanner(System.in);
	try {
	int num=sc.nextInt();
	if(num>=0) {
	long fac = 1;
	for(int i=num;i>0;i--) {
		 fac=fac*i;
	}
	if(fac>0) {
	System.out.println(fac);
	}
	else {
		System.out.println("enter less value");
	}
	}
	else {
		System.out.println("enter a positive num");
	}
	}
	catch(Exception e) {
		System.out.println("enter a valid num"+"\n"+e);
		
	}

}


}
