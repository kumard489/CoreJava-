package com.cia;

public class Stringz {
	public static void main(String arg[]) {
	

		/*//q1
		String a="GreensTechnology";
		String a1="SeleniumAutomationtool";
		String a2="kumar";
		String a3="j a v a p r o g r a m";
		String a4="9095484678";
		
		
		int value = a.length();
		int value1 = a1.length();
		int value2 = a2.length();
		int value3 = a3.length();
		int value4 = a4.length();
		
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);*/
		
		
		/*//q2
		String a="GreensTechnology";
		String a1="SeleniumAutomationtool";
		String a2="kumar";
		String a3="j a v a p r o g r a m";
		String a4="9095484678";
		
		int ans = a.indexOf('o');
		int ans1 = a1.indexOf('o');
		int ans2 = a2.indexOf('m');
		int ans3 = a3.indexOf(' ');
		int ans4 = a4.indexOf('8');
		
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);*/
		
		
		/*//q3
		String a="GreensTechnology";
		String a1="SeleniumAutomationtool";
		String a2="kumar";
		String a3="j a v a p r o g r a m";
		String a4="9095484678";
		
		char ans = a.charAt(9);
		char ans1 = a1.charAt(11);
		char ans2 = a2.charAt(2);
		char ans3 = a3.charAt(8);
		char ans4 = a4.charAt(8);
		
		
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);*/		
		
		/*//q4
		String a = "java";
		String a1 = "java";
		boolean ans = a.equals(a1);

		String b = "Java";
		String b1 = "java";
		boolean ans1 = b.equals(b1);
		
		String c = "Green Technology";
		String c1 = "GreenTechnology.";
		boolean ans2 = c.equals(c1);
		
		String d = "Java";
		String d1 = "java";
		boolean ans3 = d.equalsIgnoreCase(d1);
		
		String e = "Kumar";
		String e1 = "kumar";
		boolean ans4 = e.equalsIgnoreCase(e1);
		
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);*/
		
	/*	//5.1
		String a="velmurugank451@gmail.com";
		boolean d = a.contains("@");
		
		if(a.contains("@")) {
			System.out.println("valid email id");	
		}
		
		//5.2
		String a1="5-35-2a,venkatesh nivas,Aruppukottai";
		
		if(a1.contains("pincode")) {
			System.out.println("valid address");
		}
		else{
			System.out.println("invalid address");
		}*/
		
		/*//5.3
		String a2="Nishakerala24@gmail.com";
		boolean ans2 = a2.contains("@");
		System.out.println(ans2);*/
		
		/*//5.4
		String a3="90954a6o78";
		boolean status = false;
		
		for(int i=0; i<a3.length();i++) {
			int ac = (int) a3.charAt(i);
			if(ac >=48 && ac<=57)
			{
				status=true;
			}
			else
			{
				status=false;
				break;
			}
				
		}
		
		System.out.println(status);*/
		
		
	    
		
		
		
		
				
		
		/*//q6
		String a="89034256972365";
		int ans = a.length();
		
		if(ans < 10) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		
		String b="9095484678";
		int ans1 = b.length();
		
		if(ans1 <= 10) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}*/
		
		
		/*//q7//7.1
		String a="Welcome to class java";
		String ans = a.replace("java", "sql");
		System.out.println(ans);
		
		//7.2
		String a1="Greens Adayar";
		String ans1 = a1.replace("Adayar", "Omr");
		System.out.println(ans1);
		
		//7.3
		String a2="Welcome to java class";
		String ans2 = a2.replace(" ", "#");
		System.out.println(ans2);*/

		/*//7.4
		String a3="Nishakerala24@gmail.com";
		
		if (a3.contains("gmail")) {
			System.out.println(a3.replace("gmail", "yahoo"));
		}
		else {
			System.out.println("not present");
		}
		
		//7.5
		String a4 = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";

		if (a4.contains("pincode")) {
			System.out.println(a4.replace(",pincode-626101", " "));
		}
		else if(a4.contains("Pincode")) {
			System.out.println(a4.replace(",Pincode-626101", " "));
		
			} 
		
		else {
			System.out.println("not present");
		}*/
		
				
		
		/*// q8//8.1
		String a = "NISHANTHI";

		String ans = a.toLowerCase();
		System.out.println(ans);

		// 8.2
		String a1 = "nishanthi";
		String ans1 = a1.toUpperCase();
		System.out.println(ans1);

		// 8.3
		String a2 = "WelcomE";
		String ans2 = a2.toUpperCase();
		System.out.println(ans2);*/

		/*// 8.4
		String a3 = "WelComeToJava";
		int capsCount = 0;
		int smallCount = 0;
		for (int i = 0; i < a3.length(); i++) {
			char d = a3.charAt(i);
			if (d >= 65 && d <= 90) {
				capsCount++;
			} else if (d >= 97 && d <= 122) {
				smallCount++;
			}
		}
		System.out.println("capsCount=" + capsCount);
		System.out.println("smallCount=" + smallCount);
	}}*/
		
		/*// q9//9.1
		String a = "Welcome to java class";
		boolean ans = a.startsWith("Welcome");	
		System.out.println(ans);
		
		//9.2
		String a1="Hai i am nisha";
		boolean ans1 = a1.startsWith("welcome");
		System.out.println(ans1);
		
		//9.3
		String a2="Welcome to java class";
		boolean ans2 = a2.endsWith("class");
		System.out.println(ans2);
		
		//9.4
		String a3="Welcome to java class";
		boolean ans3 = a3.endsWith("java");
		System.out.println(ans3);
		
		//9.5
		String a4="Welcome to java class";
		boolean ans4 = a4.isEmpty();
		System.out.println(ans4);
		
		//9.6
		String a5="";
		boolean ans5 = a5.isEmpty();
		System.out.println(ans5);*/
		
		/*//q10
		String a="Nisha";
		String b="nisha";
		
		int ansa= b.compareTo(a);
		int ansb=b.compareToIgnoreCase(a);
		
		System.out.println(ansa);
		System.out.println(ansb);
		
		String a1="Nis";
		String b1="nisha";
		
		int ansa1= b1.compareTo(a1);
		int ansb1=b1.compareToIgnoreCase(a1);
		
		System.out.println(ansa1);
		System.out.println(ansb1);*/
		
		
		/*//q11//11.1
		String a="Nisha";
		String b="Nisha";
		
		int ans = System.identityHashCode(a);
		int ans1 = System.identityHashCode(b);
		
		System.out.println("a="+ans);
		System.out.println("b="+ans1);
		
		//11.2
		String a1=new String("Nisha");
		String b1=new String("Nisha");
		
		int ans2 = System.identityHashCode(a1);
		int ans3 = System.identityHashCode(b1);
		
		System.out.println("a1="+ans2);
		System.out.println("b1="+ans3);*/
		
		/*//11.3
		String a2=new String("Nisha");
		String b2=new String("Rengan");
		String c=new String("NishaRengan");
		
		int ans4 = System.identityHashCode(a2);
		int ans5 = System.identityHashCode(b2);
		int ans6 = System.identityHashCode(c);
		
		System.out.println("a2="+ans4);
		System.out.println("b2="+ans5);
		System.out.println("c="+ans6);
		
		//11.4
		String a3="Nisha";
		String b3="Rengan";
		String c1="NishaRengan";
		
		int ans7 = System.identityHashCode(a3);
		int ans8 = System.identityHashCode(b3);
		int ans9 = System.identityHashCode(c1);
		
		System.out.println("a3="+ans7);
		System.out.println("b3="+ans8);
		System.out.println("c3="+ans9);*/
		
		
		
		
	 /*//q12//12.1
	   String a="Welcome to java class";
	   String ans[] = a.split(" ");
	   
	   for(int i=0; i<ans.length; i++){
		   System.out.println(ans[i]);   
	   }
	   
	   //12.2
	   String a1="Welcome to java class";
	   String ans1[] = a1.split("l");
	   
	   
	   for (int j=0; j<ans1.length; j++) {
		   
		   System.out.println(ans1[j]);
	   }*/
		
		
		/*//q13
		String a="Welcome to java class";
		int ans1 = a.indexOf(" ");
		System.out.println(ans1);
		String ans = a.substring(0, 7);
		System.out.println(ans);*/
		
		/*//q14
		String a="Welcome"; 
		String lc = a.toLowerCase();
		
		int vowels=0;
		int consonant=0;
		
		for(int i=0; i<a.length(); i++) {
			char dk =lc.charAt(i);
			
			if (dk=='a'|| dk=='e'||dk=='i'||dk=='o'||dk=='u') {
				vowels++;
				
			}
			else{
		     consonant++;
			}
			
		}
		System.out.println("vowels="+vowels);
		System.out.println("consonant="+consonant);*/
		
		/*//q15
		String a="Welcome To Java class @123";
		int caps=0;
		int small=0;
		int splchar=0;
		int number=0;
		
		for(int i=0;i<a.length();i++) {
			char dk = a.charAt(i);
			if (dk>=65 && dk<=90) {
				caps++;
			}
			else if(dk>=97 && dk<=122) {
				small++;
			}
			else if(dk>=48 && dk<=57) {
				number++;
			}
			else {
				splchar++;
			}
			
		}
		System.out.println("caps="+caps);
		System.out.println("smalls="+small);
		System.out.println("splchars="+splchar);
		System.out.println("numbers="+number);*/
		
		/*//q16
		String a="Welcome";
		String ans = a.replaceAll("[AEIOUaeiou]", "@");
		System.out.println(ans);
		
		char dk[] = a.toCharArray();

		for (int i = 0; i < a.length(); i++) {

			if (dk[i] == 'a' || dk[i] == 'e' || dk[i] == 'i' || dk[i] == 'o' || dk[i] == 'u') {
				dk[i] = '@';
				

			}
			System.out.print(dk[i]);
		}
		for (int i = 0; i < a.length(); i++) {

			
		}*/
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	  
	
}
		
		
		
		
		
		
		
		
		
		
		
		
