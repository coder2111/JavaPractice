package New;

import java.util.Scanner;

public class DuplicateArrayelement {
public static void main(String args[]) {
	int arr[]= {7,8,3,0,1,5,7};
	System.out.println("enter number to search");
	try {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int token=0;
	for(int i=0;i<arr.length;i++) {
		if(a==arr[i]) {
			token++;
			System.out.println("found "+a+" at position "+i);
		}
	}
	if(token==0) {
		System.out.println("num is absent in array");
	}
	}
	catch(Exception e){
		System.out.println("Exception "+e);
	}
}
}
