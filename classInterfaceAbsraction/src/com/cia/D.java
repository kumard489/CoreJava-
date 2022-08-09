package com.cia;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D {

	public static void main(String arg[]) {
		int y[] = { 21, 21, 2, 21, 45, 34, 54, 5, 6, 7778, 0 };
		
		int  l=0;
		
		for (int i = 0; i < y.length; i++) {
			for (int j = i+1; j < y.length; j++) {
				if(y[i]>y[j]) {
					l=y[i];
					y[i]=y[j];
					y[j]=l;
				}
			}
			
		}
		System.out.println(Arrays.toString(y));
		
		
		
		
		
		
		
		

		int even = 0;

		int odd = 0;

		for (int i = 0; i < y.length; i++) {

			if (y[i] % 2 == 0) {
				even++;

			} else {
				odd++;

			}

		}
		System.out.println(even);
		System.out.println(odd);

		int a[] = new int[even];
		int c[] = new int[odd];
		int h = 0;
		int g = 0;
		for (int i = 0; i < y.length; i++) {

			if (y[i] % 2 == 0) {

				a[h++] = y[i];

			} else {
				c[g++] = y[i];
			}
		}
		Arrays.sort(a);	
		Arrays.sort(c);	

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		/*int a[] = { 3, 2, 1, 56, 10000, 167,0,0,1,1 };
		
		
	Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    System.out.println("smallest number ="+a[0]);
    System.out.println("largest number ="+a[a.length-1]);
    
    int largest=0;
    int acc=0;
    for (int i = 0; i < a.length; i++) {
		
		if (a[i]>largest) {
		   largest=a[i];
		   System.out.println(a[i]);
		}
	}
    //ascending and descending order array
	int temp=0;
    for (int i = 0; i < a.length; i++) {
		for (int j =i+1; j < a.length; j++) {
			if (a[i]<a[j]) {
				temp=a[i];
				//System.out.println(temp);
				a[i]=a[j];
				//System.out.println(a[i]);
				a[j]=temp;
				//System.out.println(a[j]);
				System.out.println(Arrays.toString(a));
			}
		}
		
	}
    System.out.println(Arrays.toString(a));*/
	
   
    
    
    
    
    
	}
}