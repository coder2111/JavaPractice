package ss;

public class M5_String {
public static void main(String args[]) {
	String s = "@ravi**() is&^%$#@ a good+_}{|”:><? boy";
	s = s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);
}
}
