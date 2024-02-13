package ss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


 
public class M8_Collection {
    public static void main(String[] args)
    {
    	HashSet<Integer> hs = new HashSet<>();
        hs.add(200);
        hs.add(400);
        hs.add(100);
        hs.add(500);
        hs.add(50);
        hs.add(300);
        System.out.println("HashSet does not maintain insertion order:");
        for(Integer i:hs) {
        	System.out.println(i);
        }
        
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(200);
        lhs.add(400);
        lhs.add(100);
        lhs.add(500);
        lhs.add(50);
        lhs.add(300);
        System.out.println("LinkedHashSet maintains insertion order:");
        for(Integer i:lhs) {
        	System.out.println(i);
        }
        
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(200);
        ts.add(400);
        ts.add(100);
        ts.add(500);
        ts.add(50);
        ts.add(300);
        System.out.println("TreeSet prints in ascending order:");
        for(Integer i:ts) {
        	System.out.println(i);
        }
    }
}