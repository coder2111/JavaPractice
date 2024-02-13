package ss;

public class M4_String {
public static void main(String args[]) {
	String s = "my name is ravi";
	String []ss = s.split("\\s+");
	for(String sss:ss) {
		System.out.print(sss);
	}
}
}
