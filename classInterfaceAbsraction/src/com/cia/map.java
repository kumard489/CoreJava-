package com.cia;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class map {
	public static void main(String[] args) {
		
		
		/*//q1//1.1
		int key[]= {10,20,30,40,50,60,10,50,40};
		String value[]= {"java","sql","oops","Sql","oracle","DB","selenium","psql","Hadoop"};
        
		LinkedHashMap<Integer, String> a=new LinkedHashMap<>();
		
		for (int i = 0; i < value.length; i++) {
		    a.put(key[i], value[i]);	
		}
		System.out.println("LinkedHashMap"+a);
		
		HashMap<Integer, String> b=new HashMap<>();
		b.putAll(a);
		System.out.println("HashMap"+b);
		
		//1.2
		int key1[]= {10,20,30,40,50,60,10,50,40};
		int key2[]= {10,20,30,40,50,60,10,50,40};
		
		LinkedHashMap<Integer, Integer> a1=new LinkedHashMap<>();
		
		for (int i = 0; i < key2.length; i++) {
			a1.put(key1[i], key2[i]);
		}
		System.out.println("LinkedHashMap"+a1);*/
		
		/*//1.3
		char key3[] = { '!', '@', '#', '$', '%', '^', '&', '*', '(' };
		int value2[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };
		
		LinkedHashMap<Character, Integer> a2 = new LinkedHashMap<>();

		for (int i = 0; i < value2.length; i++) {
			a2.put(key3[i], value2[i]);
		}
		System.out.println("LinkedHashMap" + a2);

		TreeMap<Character, Integer> b1 = new TreeMap<>();
		b1.putAll(a2);
		System.out.println("HashMap" + b1);
		
		//1.4
		String key4[]= {"vel","Ganesh","Dinesh","Vengat","subash"}; 
		String key5[]= {"selenium","framework","oracle","corejava","jira"};
		
		LinkedHashMap<String, String> a3=new LinkedHashMap<>();
		
		for (int i = 0; i < key5.length; i++) {
			a3.put(key4[i], key5[i]);
		}
		System.out.println("LinkedHashMap" +a3);
		
		Hashtable<String, String> b2=new Hashtable<>();
		b2.putAll(a3);
		System.out.println("Hashtable"+b2);*/
		
		/*//q2//2.1
		int key[]= {10,20,30,40,50,60,10,50,40};
        String value[]= {"java","sql","oops","Sql","oracle","DB","selenium","psql","Hadoop"};
	
		LinkedHashMap<Integer, String> a=new LinkedHashMap<>();
		
		for (int i = 0; i < value.length; i++) {
		    a.put(key[i], value[i]);
		}
		HashMap<Integer, String> b=new HashMap<>();
		b.putAll(a);
		Set<Integer> d = b.keySet();
		
		for (Integer c :d ) {
			System.out.println(c);
		}
		
		//2.2
		int key1[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };
		int key2[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };

		LinkedHashMap<Integer, Integer> a1 = new LinkedHashMap<>();

		for (int i = 0; i < key2.length; i++) {
			a1.put(key1[i], key2[i]);
		}
		Set<Integer> d1 = a1.keySet();
		for (Integer c1 : d1) {
			System.out.println(c1);
		}*/
		
		/*//2.3
		char key3[] = { '!', '@', '#', '$', '%', '^', '&', '*', '(' };
		int value2[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };
		
		LinkedHashMap<Character, Integer> a2 = new LinkedHashMap<>();

		for (int i = 0; i < value2.length; i++) {
			a2.put(key3[i], value2[i]);
		}

		TreeMap<Character, Integer> b1 = new TreeMap<>();
		b1.putAll(a2);
		Set<Character> d2 = b1.keySet();
		for (Character c2: d2) {
			System.out.println(c2);
		}
		
		//2.4
		String key4[]= {"vel","Ganesh","Dinesh","Vengat","subash"}; 
		String key5[]= {"selenium","framework","oracle","corejava","jira"};
		
		LinkedHashMap<String, String> a3=new LinkedHashMap<>();
		
		for (int i = 0; i < key5.length; i++) {
			a3.put(key4[i], key5[i]);
		}
		
		Hashtable<String, String> b2=new Hashtable<>();
		b2.putAll(a3);
		Set<String> d3 = b2.keySet();
		for (String c3 : d3) {
			System.out.println(c3);
		}*/
		
		/*//q3//3.1
		int key[]= {10,20,30,40,50,60,10,50,40};
        String value[]= {"java","sql","oops","Sql","oracle","DB","selenium","psql","Hadoop"};
	
		LinkedHashMap<Integer, String> a=new LinkedHashMap<>();
		
		for (int i = 0; i < value.length; i++) {
		    a.put(key[i], value[i]);
		}
		HashMap<Integer, String> b=new HashMap<>();
		b.putAll(a);
		Collection<String> d = b.values();
		
		for (String c :d ) {
			System.out.println(c);
		}
		
		//3.2
		int key1[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };
		int key2[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };

		LinkedHashMap<Integer, Integer> a1 = new LinkedHashMap<>();

		for (int i = 0; i < key2.length; i++) {
			a1.put(key1[i], key2[i]);
		}
		Collection<Integer> d1 = a1.values();
		for (Integer c1 : d1) {
			System.out.println(c1);
		}*/
		
		/*//3.3
		char key3[] = { '!', '@', '#', '$', '%', '^', '&', '*', '(' };
		int value2[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };
		
		LinkedHashMap<Character, Integer> a2 = new LinkedHashMap<>();

		for (int i = 0; i < value2.length; i++) {
			a2.put(key3[i], value2[i]);
		}

		TreeMap<Character, Integer> b1 = new TreeMap<>();
		b1.putAll(a2);
		Collection<Integer> d2 = b1.values();
		for (Integer c2: d2) {
			System.out.println(c2);
		}
		
		//3.4
		String key4[]= {"vel","Ganesh","Dinesh","Vengat","subash"}; 
		String key5[]= {"selenium","framework","oracle","corejava","jira"};
		
		LinkedHashMap<String, String> a3=new LinkedHashMap<>();
		
		for (int i = 0; i < key5.length; i++) {
			a3.put(key4[i], key5[i]);
		}
		
		Hashtable<String, String> b2=new Hashtable<>();
		b2.putAll(a3);
		Collection<String> d3 = b2.values();
		for (String c3 : d3) {
			System.out.println(c3);
		}*/
		
		
		/*//q4//4.1
		int key[]= {10,20,30,40,50,60,10,50,40};
        String value[]= {"java","sql","oops","Sql","oracle","DB","selenium","psql","Hadoop"};
	
		LinkedHashMap<Integer, String> a=new LinkedHashMap<>();
		
		for (int i = 0; i < value.length; i++) {
		    a.put(key[i], value[i]);
		}
		HashMap<Integer, String> b=new HashMap<>();
		b.putAll(a);
		Set<Entry<Integer, String>> c = a.entrySet();
		
		for (Entry<Integer, String> entry : c) {
			System.out.println(entry);
		}
		
		//4.2
		int key1[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };
		int key2[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };

		LinkedHashMap<Integer, Integer> a1 = new LinkedHashMap<>();

		for (int i = 0; i < key2.length; i++) {
			a1.put(key1[i], key2[i]);
		}
		Set<Entry<Integer, Integer>> c1 = a1.entrySet();
		for (Entry<Integer, Integer> entry1 : c1) {
			System.out.println(entry1);
		}*/
		
		/*//4.3
		char key3[] = { '!', '@', '#', '$', '%', '^', '&', '*', '(' };
		int value2[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };
		
		LinkedHashMap<Character, Integer> a2 = new LinkedHashMap<>();

		for (int i = 0; i < value2.length; i++) {
			a2.put(key3[i], value2[i]);
		}

		TreeMap<Character, Integer> b1 = new TreeMap<>();
		b1.putAll(a2);
		Set<Entry<Character, Integer>> c2 = a2.entrySet();
		for (Entry<Character, Integer> entry2 : c2) {
			System.out.println(entry2);
		}
		
		//4.4
		String key4[]= {"vel","Ganesh","Dinesh","Vengat","subash"}; 
		String key5[]= {"selenium","framework","oracle","corejava","jira"};
		
		LinkedHashMap<String, String> a3=new LinkedHashMap<>();
		
		for (int i = 0; i < key5.length; i++) {
			a3.put(key4[i], key5[i]);
		}
		
		Hashtable<String, String> b2=new Hashtable<>();
		b2.putAll(a3);
		Set<Entry<String, String>> c3 = b2.entrySet();
		for (Entry<String, String> entry3 : c3) {
			System.out.println(entry3);
		}*/
		
		/*//q5//5.1
		int key[]= {10,20,30,40,50,60,10,50,40};
        String value[]= {"java","sql","oops","Sql","oracle","DB","selenium","psql","Hadoop"};
	
		LinkedHashMap<Integer, String> a=new LinkedHashMap<>();
		
		for (int i = 0; i < value.length; i++) {
		    a.put(key[i], value[i]);
		}
		HashMap<Integer, String> b=new HashMap<>();
		b.putAll(a);
		Set<Entry<Integer, String>> c = a.entrySet();
		
		for (Entry<Integer, String> entry : c) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//5.2
		int key1[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };
		int key2[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };

		LinkedHashMap<Integer, Integer> a1 = new LinkedHashMap<>();

		for (int i = 0; i < key2.length; i++) {
			a1.put(key1[i], key2[i]);
		}
		Set<Entry<Integer, Integer>> c1 = a1.entrySet();
		for (Entry<Integer, Integer> entry1 : c1) {
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		}*/
		
		//5.3
		char key3[] = { '!', '@', '#', '$', '%', '^', '&', '*', '(' };
		int value2[] = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };
		
		LinkedHashMap<Character, Integer> a2 = new LinkedHashMap<>();

		for (int i = 0; i < value2.length; i++) {
			a2.put(key3[i], value2[i]);
		}

		TreeMap<Character, Integer> b1 = new TreeMap<>();
		b1.putAll(a2);
		Set<Entry<Character, Integer>> c2 = a2.entrySet();
		for (Entry<Character, Integer> entry2 : c2) {
			System.out.println(entry2.getKey());
			System.out.println(entry2.getValue());
		}
		
		//5.4
		String key4[]= {"vel","Ganesh","Dinesh","Vengat","subash"}; 
		String key5[]= {"selenium","framework","oracle","corejava","jira"};
		
		LinkedHashMap<String, String> a3=new LinkedHashMap<>();
		
		for (int i = 0; i < key5.length; i++) {
			a3.put(key4[i], key5[i]);
		}
		
		Hashtable<String, String> b2=new Hashtable<>();
		b2.putAll(a3);
		Set<Entry<String, String>> c3 = b2.entrySet();
		for (Entry<String, String> entry3 : c3) {
			System.out.println(entry3.getKey());
			System.out.println(entry3.getValue());
		}/**/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		    
	    
	    
	    
	
	}
}	
	
	


