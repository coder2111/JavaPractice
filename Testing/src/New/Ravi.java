package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ravi {
public static void main(String args[]) {
	String s="my name    is ravi my name   is ravi. ";
	Map<String, Integer> map = new HashMap<>();
	String str[]=s.split("\\s+");
	int count = 1; 
	for(int i=0;i<=str.length-1;i++) {
		if(map.containsKey(str[i])) {
	    map.put(str[i], count+1);
		}
		else {
			map.put(str[i], count);
		}
	}
	for(String ss:map.keySet()) {
		System.out.println(ss+" "+map.get(ss));
	}
}
}
