package com.cia;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UserDefinedLST  {
	 //empId,name,phone,address,dob,doj,eMail,gender,Sal
		  public static void main(String[] args) {
		    
		    Scanner in=new Scanner(System.in);
		    Scanner in1=new Scanner(System.in);
		    System.out.println("\nemployee detail 1\n");
		    Encapsulation a = new Encapsulation();
		    System.out.print("Enter your employee ID : ");
		    a.setEmpId(in.next());
		    System.out.print("Enter your name : "); 
		    a.setName(in1.nextLine());
		    System.out.print("Enter your phone number : ");
		    a.setPhoneNo(in.nextLong());
		    System.out.print("Enter your address : ");
		    a.setAddress(in1.nextLine());
		    System.out.print("Enter your date of birth : ");
		    a.setDob(in1.nextLine());
		    System.out.print("Enter your date of joining : ");
		    a.setDoj(in1.nextLine());
		    System.out.print("Enter your email ID : ");
		    a.setEmailId(in1.nextLine());
		    System.out.print("Enter your gender : ");
		    a.setGender(in.next());
		    System.out.print("Enter your salary : ");
		    a.setSal(in.nextInt());
		    
		    System.out.print("\nemployee detail 2\n");
		    Encapsulation b = new Encapsulation();
		    System.out.print("Enter your employee ID : ");
		    b.setEmpId(in.next());
		    System.out.print("Enter your name : ");
		    b.setName(in1.nextLine());
		    System.out.print("Enter your phone number : ");
		    b.setPhoneNo(in.nextLong());
		    System.out.print("Enter your address : ");
		    b.setAddress(in1.nextLine());
		    System.out.print("Enter your date of birth : ");
		    b.setDob(in1.nextLine());
		    System.out.print("Enter your date of joining : ");
		    b.setDoj(in1.nextLine());
		    System.out.print("Enter your email ID : ");
		    b.setEmailId(in1.nextLine());
		    System.out.print("Enter your gender : ");
		    b.setGender(in.next());
		    System.out.print("Enter your salary : ");
		    b.setSal(in.nextInt());
		    
		   
		   
		    
		    //user defined set
		    Set<Encapsulation> details=new LinkedHashSet<Encapsulation>();
		    details.add(a);
		    details.add(b);
		    int count=1;
		    for (Encapsulation c : details) {
		    	
		    	System.out.println("\nEmployee : "+(count++));
		    	System.out.println("Employee ID : "+c.getEmpId());
		    	System.out.println("Name : "+c.getName());
		    	System.out.println("Phone number : "+c.getPhoneNo());
		    	System.out.println("Address : "+c.getAddress());
		    	System.out.println("Date of birth : "+c.getDob());
		    	System.out.println("Date of joining : "+c.getDoj());
		    	System.out.println("Email ID : "+c.getEmailId());
		    	System.out.println("Gender : "+c.getGender());
		    	System.out.println("Salary : "+c.getSal());
			}
		    
		    //user defined map
		    Map<Integer, Encapsulation> k=new LinkedHashMap<Integer, Encapsulation>();
		    k.put(1, a);
		    k.put(2, b);
		    
		    Set<Entry<Integer, Encapsulation>> en = k.entrySet();
		    
		    for (Entry<Integer, Encapsulation> entry : en) {
				
		    	System.out.println("\nEmployee : "+entry.getKey());
		    	System.out.println("Employee ID : "+entry.getValue().getEmpId());
		    	System.out.println("Name : "+entry.getValue().getName());
		    	System.out.println("Phone number : "+entry.getValue().getPhoneNo());
		    	System.out.println("Address : "+entry.getValue().getAddress());
		    	System.out.println("Date of birth : "+entry.getValue().getDob());
		    	System.out.println("Date of joining : "+entry.getValue().getDoj());
		    	System.out.println("Email ID : "+entry.getValue().getEmailId());
		    	System.out.println("Gender : "+entry.getValue().getGender());
		    	System.out.println("Salary : "+entry.getValue().getSal());
		    	
		    	
		    	
			}
		    
		    
		    
		    
		    
		  }

}