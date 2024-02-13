package ss;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class M6_Collection {
public static void main(String args[]) {
   
	List<Integer> arrayList = new ArrayList<>();
	System.out.println("------ArrayList-------"+"\n"+"ArrayList maintains insertion order:");
	arrayList.add(300);
	arrayList.add(200);
	arrayList.add(400);
	arrayList.add(100);
	arrayList.add(500);
	arrayList.add(50);
	for(int i=0;i<arrayList.size();i++) {
		System.out.println(arrayList.get(i));
		
	}
	arrayList.remove(2);
	System.out.println("after removel");
	for(int j=0;j<arrayList.size();j++) {
		System.out.println(arrayList.get(j));
	}
	System.out.println("----LinkedList------"+"\n"+"LinkedList maintains insertion order:");
	List<Integer> linkedlist = new LinkedList<>();
	linkedlist.add(300);
	linkedlist.add(200);
	linkedlist.add(400);
	linkedlist.add(100);
	linkedlist.add(500);
	linkedlist.add(50);
	
	for(int i=0;i<linkedlist.size();i++) {
		System.out.println(linkedlist.get(i));
	}
	linkedlist.remove(1);
	System.out.println("after removel");
	for(int i=0;i<linkedlist.size();i++) {
		System.out.println(linkedlist.get(i));
	}
	System.out.println("-----Vector-----"+"\n"+"Vector maintains insertion order:");
	Vector<Integer> vector = new Vector<>();
	vector.add(300);
	vector.add(200);
	vector.add(400);
	vector.add(100);
	vector.add(500);
	vector.add(50);
	for(int i=0;i<vector.size();i++) {
		System.out.println(vector.get(i));
	}
	System.out.println("after removal");
	vector.remove(2);
	for(int i=0;i<vector.size();i++) {
		System.out.println(vector.get(i));
	}
	System.out.println("-----Stack-----"+"\n"+"Stack maintains insertion order:");
	Stack<Integer> stack = new Stack<>();
	stack.push(300);
	stack.push(200);
	stack.push(400);
	stack.push(100);
	stack.push(500);
	stack.push(50);
	for(int i=0;i<stack.size();i++) {
		System.out.println(stack.get(i));
	}
	System.out.println("after removal");
	stack.pop();
	for(int i=0;i<stack.size();i++) {
		System.out.println(stack.get(i));
	}
	System.out.println("---PriorityQueue----"+"\n"+"PriorityQueue does not maintain insertion order:");
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	pq.add(300);
	pq.add(200);
	pq.add(400);
	pq.add(100);
	pq.add(500);
	pq.add(50);
	Iterator<Integer> itr22 = pq.iterator();
	while(itr22.hasNext()) {
		System.out.println(itr22.next());
	}
	// Printing the top element of PriorityQueue
	System.out.println("peek:"+pq.peek());
	// Printing the top element and removing it from the PriorityQueue container
	System.out.println("poll:"+pq.poll());
	System.out.println("peek:"+pq.peek());
	Iterator<Integer> itr7 = pq.iterator();
	while(itr7.hasNext()) {
		System.out.println(itr7.next());
	}
	System.out.println("----ArrayDeque----"+"\n"+"ArrayDeque maintains insertion order");
	ArrayDeque<Integer> ad = new ArrayDeque<>();
	ad.add(300);
	ad.add(200);
	ad.add(400);
	ad.add(100);
	ad.add(500);
	ad.add(50);
	Iterator<Integer> itr3 = ad.iterator();
	while(itr3.hasNext()) {
		System.out.println(itr3.next());
	}
	System.out.println("After clear:");
	//clear() method removes all elements from que
	ad.clear();
	Iterator<Integer> itr4 = ad.iterator();
	while(itr4.hasNext()) {
		System.out.println(itr4.next());
	}
	ad.addFirst(2000);
	ad.addFirst(1000);
	ad.addLast(3000);
	ad.addLast(900);
	Iterator<Integer> itr5 = ad.iterator();
	while(itr5.hasNext()) {
		System.out.println(itr5.next());
	}
	System.out.println("----HashSet----"+"\n"+"HashSet does not maintain insertion order:");
	HashSet<Integer> hs = new HashSet<>();
	hs.add(300);
	hs.add(200);
	hs.add(400);
	hs.add(100);
	hs.add(500);
	hs.add(50);
	Iterator<Integer> itr1 = hs.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	System.out.println("----LinkedHashSet-----"+"\n"+"LinkedHashSet maintains insertion order:");
	LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	lhs.add(300);
	lhs.add(200);
	lhs.add(400);
	lhs.add(100);
	lhs.add(500);
	lhs.add(50);
	Iterator<Integer> itr = lhs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("----TreeSet----"+"\n"+"TreeSet prints in ascending order:");
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(300);
	ts.add(200);
	ts.add(400);
	ts.add(100);
	ts.add(500);
	ts.add(50);
	Iterator<Integer> ite = ts.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	
	System.out.println("----HashMap------"+"\n"+"HashMap does not maintain insertion order:");
	HashMap<Integer,String> hm = new HashMap<>();
	hm.put(300, "300");
	hm.put(200, "200");
	hm.put(400, "400");
	hm.put(100, "100");
	hm.put(500, "500");
	hm.put(50, "50");
	for(Map.Entry<Integer,String> m:hm.entrySet()){
		System.out.println(m.getKey()+" : "+m.getValue());
	}
	System.out.println("----LinkedHashMap----"+"\n"+"LinkedHashMap maintains insertion order:");
	LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
	lhm.put(300, "300");
	lhm.put(200, "200");
	lhm.put(400, "400");
	lhm.put(100, "100");
	lhm.put(500, "500");
	lhm.put(50, "50");
	for(Map.Entry<Integer, String> m:lhm.entrySet()) {
		System.out.println(m.getKey()+" : "+m.getValue());
	}
	System.out.println("----TreeMap----"+"\n"+"TreeMap prints in ascending order:");
	TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
	tm.put(300, "300");
	tm.put(200, "200");
	tm.put(400, "400");
	tm.put(100, "100");
	tm.put(500, "500");
	tm.put(50, "50");
	for(Map.Entry<Integer, String> m:tm.entrySet()) {
		System.out.println(m.getKey()+" : "+m.getValue());
	}
}
}
