package ss;

public class M2_String {
public static void main(String args[]) {
	String str = "my name is ravi";
	String[] tok = str.split("\\s+");
	int len = tok.length;
	String[] rev = new String[len];
	int k=0;
	for(int i=len-1;i>=0;i--) {
		rev[k]=tok[i];
		k++;
	}
	for(String ss:rev) {
		System.out.print(ss+" ");
	}
}
}
