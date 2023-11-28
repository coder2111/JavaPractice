package ss;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringProg {
public static void main(String args[]) {
	/* replace junk */
	/*String s="!@##$%^&*()_+{}| my name is ravi :<>?";
	s=s.replaceAll("[^a-zA-Z0-9]", " ");
	System.out.println(s.trim()); */
	
	/* replace white space */
	/*String k="i   am   good  how  are you.   What  should   i  do";
	k=k.replaceAll("\\s+", " ");
	System.out.println(k); */
	
	/* count occurence of a character */
	/*String nn="this is ravi jeedula. what is your name";
	int len=nn.length();
	System.out.println(len);
	System.out.println("enter charater to find count");
	Scanner sc=new Scanner(System.in);
	String sss=sc.next();
	String nn1 = nn.replace(sss, "");
	int len2=nn1.length();
	System.out.println(len2);
	System.out.println("occurence of "+sss+":"+(len-len2));
	sc.close(); */
	
	/* count spaces in a string */
	/*System.out.println("enter a sentence");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	//String gg="this is ravi  jeedula, learning coding";
	int len1=str.length();
	//System.out.println(len1);
	String gg1=str.replace(" ", "");
	int leng2=gg1.length();
	//System.out.println(leng2);
	int len3=len1-leng2;
	System.out.println("occurence of single spaces:"+len3);
	sc.close(); */
	
	/* count words in a string */
	/*System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String words[]=s.split("\\s+");
	System.out.println("count of words in string:"+words.length);
	sc.close();*/
	
	/* count occurrences of a letters in a word */
	/*System.out.println("enter your word");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char c[]=s.toCharArray();
	System.out.println(s);
	int val=1;
	Map<Character,Integer> map = new HashMap<>();
	for(char cc:c) {
		if(map.containsKey(cc)) {
		map.put(cc,map.get(cc)+1);
		}
		else {
			map.put(cc, val);
		}
	}
	System.out.println(map); */
	
	/* count the occurrence of words in a string */
	/*System.out.println("enter a sentence");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String arr[]=s.split("\\s+");
	Map<String,Integer> map=new HashMap<>();
	for(String s1:arr) {
		if(map.containsKey(s1)) {
			map.put(s1, map.get(s1)+1);
		}
		else {
			map.put(s1, 1);
		}
	}
	System.out.println(map); */
	
	/* count the occurrence of letters in a string */
	System.out.println("enter a sentence");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1=s.replaceAll("\\s+", "");
//	System.out.println(s1);
	char c[]=s1.toCharArray();
    Map<Character,Integer> map=new HashMap<>();
    for(char cc:c) {
    	if(map.containsKey(cc)) {
    		map.put(cc, map.get(cc)+1);
    	}
    	else {
    		map.put(cc, 1);
    	}
    }
    System.out.println(map);
}
}
