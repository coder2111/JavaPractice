package New;

import java.util.Scanner;

public class PrimeNum {
public static void main(String args[]) {
//	prime num:
//   1) num > 1
//   2) divisible by 1 and itself
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num>1) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime num");
		}
		else {
			System.out.println("not prime");
		}
	}
	else {
		System.out.println("not prime num");
	}
}
}
