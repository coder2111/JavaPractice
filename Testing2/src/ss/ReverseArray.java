package ss;

import java.util.Arrays;

public class ReverseArray {
public static void main(String args[]) {
	int arr[]= {1,2,3,4,5};
	int len=arr.length;
	int rev[] = new int[len];
	for(int i=0;i<len;i++) {
		rev[i]=arr[len-1-i];
	}
	System.out.println(Arrays.toString(rev));
}
}
