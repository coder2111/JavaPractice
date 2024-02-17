package ss;

import java.util.Scanner;

public class Daily5_Fabanoci {
public static void main(String args[]) {
	System.out.println("how many elements?");
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	k=k-2;
	int n1=0,n2=1;
	System.out.println(n1+"\n"+n2);
	for(int i=0;i<k;i++) {
	int n3=n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
	}
	}
}
