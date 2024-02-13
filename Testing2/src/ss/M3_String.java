package ss;

public class M3_String {
public static void main(String args[]) {
	String s="my  name is ravi";
	String st[]=s.split("\\s");
	int len = st.length;
	for(int i=0;i<len;i++) {
		char[] ch = st[i].toCharArray();
		int le = ch.length;
		char[] re = new char[le];
		int p=0;
		for(int k=le-1;k>=0;k--) {
			re[p] = ch[k];
			p++;
		}
		for(char cc:re) {
		System.out.print(cc);
		}
		System.out.print(" ");
	}
}
}
