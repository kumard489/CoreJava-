package com.cia;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set {
	public static void main(String arg[]) {
		/*//q1//1.1
		int list[] = {10,20,30,40,50,60,70,80,90,10,20};
		
		HashSet<Integer> a=new HashSet<>();
        
		for (Integer b : list) {
			a.add(b);
		}
		System.out.println(a);
		
		//q1.2
		int list1[] = {10,20,30,40,50,60,70,80,90,10,20};
		
		LinkedHashSet<Integer> a1=new LinkedHashSet<>();
		
		for (int i = 0; i < list1.length; i++) {
			a1.add(list1[i]);
	    }
        System.out.println(a1);
        
        //q1.3
       int list2[] = {10,20,30,40,50,60,70,80,90,10,20};
	   
       TreeSet<Integer> a2=new TreeSet<>();
       
		for (int i = 0; i < list2.length; i++) {
            a2.add(list2[i]);
		}
		System.out.println(a2);*/
		
		/*//q2//2.1
		int list[] = {10,20,30,90,10,10,40,50};
		
		ArrayList<Integer> a=new ArrayList<>();
		
		for (int i = 0; i < list.length; i++) {
			a.add(list[i]);
		}
		System.out.println("list"+a);
		
		LinkedHashSet<Integer> b=new LinkedHashSet<>();
		b.addAll(a);
		System.out.println("set"+b);
		
		//q2.2
		int list1[] = {105,205,305,405,505,605,705,805,505,605};
		
		ArrayList<Integer> a1 = new ArrayList<>();

		for (int i = 0; i < list1.length; i++) {
			a1.add(list1[i]);
		}
		System.out.println("list"+a1);

		LinkedHashSet<Integer> b1 = new LinkedHashSet<>();
		b1.addAll(a1);
		System.out.println("set"+b1);
		
		//q2.3
		int list2[] = {100,200,300,400,500,600,700,100,300,500};
		
		ArrayList<Integer> a2 = new ArrayList<>();

		for (int i = 0; i < list2.length; i++) {
			a2.add(list2[i]);
		}
		System.out.println("list"+a2);

		LinkedHashSet<Integer> b2 = new LinkedHashSet<>();
		b2.addAll(a2);
		System.out.println("set"+b2);*/

		/*//q3//3.1
		int list[] = {105,205,305,405,505,605,705,805};
		
		LinkedHashSet<Integer> a=new LinkedHashSet<>();
		
		for (int i : list) {
			a.add(i);
		}
		System.out.println(a);
		
		//3.2
		int list1[] = {10,20,30,40,50,60,70,80,90,10,20};

		TreeSet<Integer> a1 = new TreeSet<>();
		
		for (int i : list1) {
			a1.add(i);
		}
		System.out.println(a1);
		
		//q3.3
		int list2[] = {10,20,30,40,50,60,70,80,90,10,20};

		HashSet<Integer> a2 = new HashSet<>();
		
		for (int i : list2) {
			a2.add(i);
		}
		System.out.println(a2);*/
		
		/*//4//4.1
		int list[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20 };
		int list1[] = {30,40,50,60,80};
		
		HashSet<Integer> a = new HashSet<>();
		HashSet<Integer> a1 = new HashSet<>();
		
		for (int i : list) {
			a.add(i);	
		}
		for (int i : list1) {
			a1.add(i);	
		}
		System.out.println(a);
		System.out.println(a1);

		a.retainAll(a1);
		System.out.println("common value"+a);*/
		
		/*//4.2
		int list1[] = {10,20,30,90,10,10,40,50};
		int list2[] = {10,20,60,50,40,70,80,90};
		
		LinkedHashSet<Integer> a1 = new LinkedHashSet<>();
		LinkedHashSet<Integer> a2 = new LinkedHashSet<>();
		
		for (int i : list1) {
			a1.add(i);	
		}
		for (int i : list2) {
			a2.add(i);	
		}
		System.out.println(a1);
		System.out.println(a2);

		a1.retainAll(a2);
		System.out.println("common value"+a1);*/
		
		/*//4.3
		int list2[] = {10,20,30,40,50,60,70,80};
		int list3[] = {100,200,300,400,500,600,700,8000};
		
		TreeSet<Integer> a1 = new TreeSet<>();
		TreeSet<Integer> a2 = new TreeSet<>();
		
		for (int i : list2) {
			a1.add(i);	
		}
		for (int i : list3) {
			a2.add(i);	
		}
		System.out.println(a1);
		System.out.println(a2);

		a1.retainAll(a2);
		System.out.println("common value"+a1);*/
		
		/*//q5//5.1
		int list[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20 };
		int list1[] = {30,40,50,60,80};
		
		HashSet<Integer> a = new HashSet<>();
		HashSet<Integer> a1 = new HashSet<>();
		
		for (int i : list) {
			a.add(i);	
		}
		for (int i : list1) {
			a1.add(i);	
		}
		System.out.println(a);
		System.out.println(a1);

		a.removeAll(a1);
		System.out.println("removing common value"+a);*/
		
		/*//5.2
		int list1[] = {10,20,30,90,10,10,40,50};
		int list2[] = {10,20,60,50,40,70,80,90};
		
		LinkedHashSet<Integer> a1 = new LinkedHashSet<>();
		LinkedHashSet<Integer> a2 = new LinkedHashSet<>();
		
		for (int i : list1) {
			a1.add(i);	
		}
		for (int i : list2) {
			a2.add(i);	
		}
		System.out.println(a1);
		System.out.println(a2);

		a1.removeAll(a2);
		System.out.println("removing common value"+a1);*/
		
		/*//5.3
		int list2[] = {10,20,30,40,50,60,70,80};
		int list3[] = {100,200,300,400,500,600,700,8000};
		
		TreeSet<Integer> a1 = new TreeSet<>();
		TreeSet<Integer> a2 = new TreeSet<>();
		
		for (int i : list2) {
			a1.add(i);	
		}
		for (int i : list3) {
			a2.add(i);	
		}
		System.out.println(a1);
		System.out.println(a2);

		a1.removeAll(a2);
		System.out.println("removing common value"+a1);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
