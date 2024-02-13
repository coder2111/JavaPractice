package ss;

public class M1_String {
public static void main(String args[]) {
	String str = "shyam ravi";
	char ch[]=str.toCharArray();
	int length = str.length();
	char rev[] = new char[length];
	int k=0;
	for(int i=length-1;i>=0;i--) {
		rev[k]=ch[i];
		k++;
	}
	for(char m:rev) {
		System.out.print(m);
	}
}
}
