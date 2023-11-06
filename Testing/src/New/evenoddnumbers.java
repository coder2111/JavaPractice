package New;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class evenoddnumbers {
public static void main(String args[]) {
	int a=3234234;
	List<Integer> even = new ArrayList<>();
	List<Integer> odd = new ArrayList<>();
	while (a>0) {
	int k =	a%10;
	a=a/10;
	if(k%2==0) {
		even.add(k);
	}
	else {
		odd.add(k);
	}
	}
	System.out.println("even numbers:"+even+"\n"+"odd numbers:"+odd);
	
	
}
}
