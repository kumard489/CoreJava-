package com.cia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Arrays1 {
	public static void main(String args[]) {
		
	    /*// q1
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum += a[i];
		}
		System.out.println(sum);*/
		 
		
		/*//q2 
		int a1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		float average = 0f;
		float count = 0;

		for (int i = 0; i < a1.length; i++) {
			average += a1[i];
			count++;

		}
		System.out.println(average / count);*/

		
		/*//q3 
		int a[] = { 10, 10, 20, 50, 60, 80, 60, 50 };
		System.out.println(Arrays.toString(a));

		int index = 0;
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && a[j] != 0) {
					a[j] = 0;
					c++;
				}
			}

		}
		// c=dublicate value
		int b[] = new int[a.length - c];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[index++] = a[i];
			}

		}

		System.out.println(Arrays.toString(b));*/
		 

		
		/*// q4//4.1
		int list[] = { 10, 20, 30, 90, 10, 10, 40, 50 };

		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < list.length; i++) {
			int b = list[i];
			a.add(b);
		}
		System.out.println("arraylist length  = " + a.size());*/
		  
		/*// 4.2
		int list1[] = { 100, 200, 300, 400, 500, 600, 700 };

		LinkedList<Integer> a1 = new LinkedList<Integer>();

		for (int i = 0; i < list1.length; i++) {
			int b1 = list1[i];
			a1.add(b1);
		}
		System.out.println("linkedlist length = " + a1.size());*/

		/*// 4.3 
		int list2[] = {105,205,305,405,505,605,705,805};

		Vector<Integer> a2 = new Vector<>();

		for (int i = 0; i < list2.length; i++) {
			int b2 = list2[i];
			a2.add(b2);
		}
		System.out.println("vector length     = " + a2.size());
		  
		// 4.4
		int list3[] = { 100, 200, 300, 400, 500, 600, 700 };

		LinkedList<Integer> a3 = new LinkedList<>();

		for (int i = 0; i < list3.length; i++) {
			int b3 = list3[i];
			a3.add(b3);
		}
		System.out.println("linkedlist size   = " + a3.size());*/
		 

		/*// 5//5.1
		int List[] = { 10, 20, 30, 90 };

		ArrayList<Integer> a = new ArrayList<>();
		int i = 0;
		while (i < List.length) {
			int b = List[i];
			a.add(b);
			i++;
		}
		System.out.println("the first index value of 10 =" + a.indexOf(10));

		// 5.2
		int list1[] = { 10, 20, 30, 90, 10, 10, 40, 50 };

		ArrayList<Integer> a1 = new ArrayList<>();
		int i1 = 0;
		while (i1 < list1.length) {
			int b1 = list1[i1];
			a1.add(b1);
			i1++;
		}
		System.out.println("the last index value of 10 =" + a1.lastIndexOf(10));*/

		/*// 5.3
		int list2[] = { 10, 20, 30, 90, 10, 10, 40, 50 };

		ArrayList<Integer> a2 = new ArrayList<>();

		for (int j = 0; j < list2.length; j++) {
			int b2 = list2[j];
			a2.add(b2);
		}
		System.out.println("the index value of 50 =" + a2.indexOf(50));

		// 5.4
		int list3[] = { 10, 20, 30, 90, 10, 10, 40, 50 };

		ArrayList<Integer> a3 = new ArrayList<>();

		for (int j = 0; j < list3.length; j++) {
			int b3 = list3[j];
			a3.add(b3);
		}
		System.out.println("the index value of 90 =" + a3.indexOf(90));*/

		/*// 5.5
		int list4[] = { 10, 20, 30, 90, 10, 10, 40, 50, 10 };

		ArrayList<Integer> a4 = new ArrayList<>();
        
        
		for (int j = 0; j < list4.length; j++) {
			int b4 = list4[j];
			a4.add(b4);	
		}
		System.out.println(a4);
		 
		
		for (int j=0; j<=a4.size()-1; j++) {
			int c = a4.indexOf(10);
			
			if (a4.get(j)==10) {
				a4.set(j, null);
				System.out.println("index positions of 10 ="+c);		
			}		
		}*/
		
		/*//5.6
		int list5[] = {10,20,30,90,10,10,40,50,10};
		
		ArrayList<Integer> a5=new ArrayList<>();
		
		 for (int j = 0; j < list5.length; j++) {
			 int b5=list5[j];
			 a5.add(b5);
		}
		if (a5.contains(70)) {
			System.out.println("index values of ="+a5.indexOf(70));
		} 
		else {
            System.out.println("the given value is not found in arraylist");
		}*/
		
		
		/*//6//6.1
		int list1[] = {10,20,30,40,50,60};
		
		ArrayList<Integer> a=new ArrayList<>();
		
		for (int i = 0; i < list1.length; i++) {
			int b=list1[i];
			a.add(b);
		}
		System.out.println("the value present at 2nd index ="+a.get(2));
		
		// 6.2
		int list2[] = { 100, 200, 300, 400, 500, 600, 700 };

		ArrayList<Integer> a1 = new ArrayList<>();

		for (int i = 0; i < list2.length; i++) {
			int b1 = list2[i];
			a1.add(b1);
		}
		System.out.println("the value present at 4th index =" + a1.get(4));*/
		
	    /*//6.3
		int list3[] = { 105,205,305,405,505,605,705,805};

		ArrayList<Integer> a2 = new ArrayList<>();

		for (int i = 0; i < list3.length; i++) {
			int b2 = list3[i];
			a2.add(b2);
		}
		if (a2.size()==9) {
			System.out.println("the value present at 8th index =" + a2.get(8));
			
		} 
		else {
			System.out.println("the given index not found in arraylist"); 
		}*/
		
		
		/*//q6.4
		//Input:   List = 105,205,305,405,505,605,705,805
		ArrayList<Integer> a3=new ArrayList<>();
		
		a3.add(105);
		a3.add(205);
		a3.add(305);
		a3.add(405);
		a3.add(505);
		a3.add(605);
		a3.add(705);
		a3.add(805);
		
		System.out.println("for loop");
		for (int i = 0; i < a3.size(); i++) {
			System.out.print(a3.get(i)+",");
		}
		
		//q6.5
		System.out.println("");
		System.out.println("enhanced for loop");
		for (Integer ab : a3) {
	        System.out.print(ab+",");	
		}*/
		
		/*//q7//7.1
		int list[] = {10,20,30,40,50,60};

		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < list.length; i++) {
			int b = list[i];
			a.add(b);
		}
		System.out.println("before removing 2nd index");
		System.out.println(a);
		Integer remove = a.remove(2);
		System.out.println("after removing 2nd index");
		System.out.println(a);
		
		//7.2
		int list1[] = {10,20,30,40,50,60};

		ArrayList<Integer> a1 = new ArrayList<>();

		for (int i = 0; i < list1.length; i++) {
			int b1 = list1[i];
			a1.add(b1);
		}
		if (a1.size()==11) {
			System.out.println(a1.remove(10));
		} 
		else {
			System.out.println("the given index not found in arraylist");
		}*/
		
		/*//7.3
		int list2[] = {10,20,30,90,10,10,40};

		ArrayList<Integer> a2 = new ArrayList<>();

		for (int i = 0; i < list2.length; i++) {
			int b2 = list2[i];
			a2.add(b2);
		}
		System.out.println("before removing 10");
		System.out.println(a2);
		System.out.println("last index of 10 ="+a2.lastIndexOf(10));
		a2.remove(5);
		System.out.println("before removing 10");
		System.out.println(a2);*/
		
		/*//q8//8.1
		int list[] = {10,20,30,90,10,10,40,50};

		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < list.length; i++) {
			int b = list[i];
			a.add(b);
		}
		System.out.println("before");
		System.out.println(a);
		a.add(2, 50);
		System.out.println("after");
		System.out.println(a);

		//8.2
		int list1[] = {10,20,30,90,10,10,40,50};

		ArrayList<Integer> a1 = new ArrayList<>();

		for (int i = 0; i < list1.length; i++) {
			int b1 = list1[i];
			a1.add(b1);
		}
		System.out.println("before");
		System.out.println(a1);
		a1.add(a1.size(), 70);
		System.out.println("after");
		System.out.println(a1);*/
		
		/*//q8.3
		int list2[] = {10,20,30,90,10,10,40,50};

		ArrayList<Integer> a2 = new ArrayList<>();

		for (int i = 0; i < list2.length; i++) {
			int b2 = list2[i];
			a2.add(b2);
		}
		System.out.println("before");
		System.out.println(a2);
		a2.add(8, 80);
		System.out.println("after");
		System.out.println(a2);
		
		//8.4
		int list3[] = {10,20,30,90,10,10,40,50};

		ArrayList<Integer> a3 = new ArrayList<>();

		for (int i = 0; i < list3.length; i++) {
			int b3 = list3[i];
			a3.add(b3);
		}
		if (a3.size()==11) {
			a3.add(10, 100);
			System.out.println(a3);
		}
		else {
			System.out.println("the given index is not found");
		}*/
		
		/*//q9//9.1
		int list[] = {100,200,300,400,500,600,700};

		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < list.length; i++) {
			int b = list[i];
			a.add(b);
		}
		System.out.println("before");
		System.out.println(a);
		System.out.println("index of 300 ="+a.indexOf(300));
		Integer set = a.set(2, 350);
		System.out.println("after");
		System.out.println(a);
		
		//9.2
		int list1[] = {10,20,30,90,10,10,40,50,10};

		ArrayList<Integer> a1 = new ArrayList<>();

		for (int i = 0; i < list1.length; i++) {
			int b1 = list1[i];
			a1.add(b1);
		}
		System.out.println("before");
		System.out.println(a1);
		Integer set1 = a1.set(7, 90);
		System.out.println("after");
		System.out.println(a1);*/
		
		/*//9.3
		int list2[] = {10,20,30,90,10,10,40,50,10};

		ArrayList<Integer> a2 = new ArrayList<>();

		for (int i = 0; i < list2.length; i++) {
			int b2 = list2[i];
			a2.add(b2);
		}
		System.out.println("before");
		System.out.println(a2);
		System.out.println("index of 10 ="+a2.indexOf(10));
		Integer set = a2.set(0, 100);
		System.out.println("after");
		System.out.println(a2);*/
		
		/*//q10//10.1
        int list[] = {10,20,30,90,10,10,40,50};
		int list1[] = {30,40,50,60,80};
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> a1 = new ArrayList<>();
		
		for (int i = 0; i < list.length; i++) {
			a.add(list[i]);
		}
		for (int j = 0; j < list1.length; j++) {
			a1.add(list1[j]);
		}
		System.out.println(a);
		System.out.println(a1);
		a.retainAll(a1);
		System.out.println("common values="+a);*/
		
		/*//10.2
		int list1[] = { 10, 20, 30, 90, 10, 10, 40, 50 };
		int list2[] = { 10, 20, 60, 50, 40, 70, 80, 90 };

		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();

		for (int i = 0; i < list1.length; i++) {
			a1.add(list1[i]);
		}
		for (int j = 0; j < list2.length; j++) {
			a2.add(list2[j]);
		}
		System.out.println(a1);
		System.out.println(a2);
		a1.retainAll(a2);
		System.out.println("common values="+a1);*/
		
		/*//10.3
		int list2[] = { 10,20,30,40,50,60,70,80};
		int list3[] = {100,200,300,400,500,600,700,8000 };

		ArrayList<Integer> a2 = new ArrayList<>();
		ArrayList<Integer> a3 = new ArrayList<>();

		for (int i = 0; i < list2.length; i++) {
			a2.add(list2[i]);
		}
		for (int j = 0; j < list3.length; j++) {
			a3.add(list3[j]);
		}
		System.out.println(a2);
		System.out.println(a3);
		a2.retainAll(a3);
		System.out.println("common values="+a2);*/
		
		/*//q11//11.1
		int list[] = { 10,20,30,90,10,10,40,50};
		int list1[] = {30,40,50,60,80};

		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> a1 = new ArrayList<>();

		for (int i = 0; i < list.length; i++) {
			a.add(list[i]);
		}
		for (int j = 0; j < list1.length; j++) {
			a1.add(list1[j]);
		}
		System.out.println(a);
		System.out.println(a1);
		a.removeAll(a1);
		System.out.println("removing common values ="+a);*/
		
		/*//11.2
		int list1[] = { 10, 20, 30, 90, 10, 10, 40, 50 };
		int list2[] = { 10, 20, 60, 50, 40, 70, 80, 90 };

		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();

		for (int i = 0; i < list1.length; i++) {
			a1.add(list1[i]);
		}
		for (int j = 0; j < list2.length; j++) {
			a2.add(list2[j]);
		}
		System.out.println(a1);
		System.out.println(a2);
		a1.removeAll(a2);
		System.out.println("removing common values="+a1);*/
		
		/*//11.3
		int list2[] = { 10,20,30,40,50,60,70,80};
		int list3[] = {100,200,300,400,500,600,700,8000 };

		ArrayList<Integer> a2 = new ArrayList<>();
		ArrayList<Integer> a3 = new ArrayList<>();

		for (int i = 0; i < list2.length; i++) {
			a2.add(list2[i]);
		}
		for (int j = 0; j < list3.length; j++) {
			a3.add(list3[j]);
		}
		System.out.println(a2);
		System.out.println(a3);
		a2.removeAll(a3);
		System.out.println("removing common values="+a2);*/
	}

	
	}


