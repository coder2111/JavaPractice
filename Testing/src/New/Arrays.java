package New;

public class Arrays {
public static void main(String args[]) {
	String arr1[]= {"ravi","venu","shyam","shravani"};
	String arr2[]= {"ravi","venu","shyam","shravani1"};
	int token=0;
	for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				token =1;
			}
		}
	
	if(token==1) {
		System.out.println("both arrays are not equal");
	}
	else {
		System.out.println("they are equal");
	}
}
}
