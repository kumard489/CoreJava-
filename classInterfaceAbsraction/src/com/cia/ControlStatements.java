package com.cia;



import java.util.Scanner;



public class ControlStatements {

	public static void main(String arg[]) {
		
		
		
		/*// q1 (voter eligible age)
		System.out.print("Enter your age =");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligible");
		}*/
		
		

		/*// q2(even or odd number)
		System.out.print("Enter the number =");
		Scanner input = new Scanner(System.in);
		int oddOrEven = input.nextInt();

		if (oddOrEven % 2 == 0) {
			System.out.println("The given number is even");
		} else {
			System.out.println("The given number is odd");
		}*/

		/*// another method
		String ore = (oddOrEven % 2 == 0) ? "even" : "odd";

		System.out.println(ore);*/
		
		
		
		
		/*// q3
		for (int i = 1; i <= 100; i++) {
			if (i % 2   ==0) {
				System.out.println(i);
			}
		}*/
		
		
		
		
		/*// q4
		int countOfOddNum = 0;
		for (int i= 0; i <= 100; i++) {
			// finding how many odd numbers formula(2n+1)
			// n=total numbers
			int j=((2 * i) + 1);
			if ( j<= 100) {
				countOfOddNum+=j;
			}
		}
		System.out.println("countOfOddNum="+countOfOddNum);
		//another method
		int countOfOddNum = 0;
		int i=0;
		while (i<=100) {
			if (i%2 != 0) {
				countOfOddNum++;
			}
			i++;
			
		}
		//another method
		int countOfOddNum = 0;
		for (int i= 0; i <= 100; i++) {
			// finding how many odd numbers formula(2n+1)
			// n=total numbers
			if (((2 * i) + 1) <= 100) {
				countOfOddNum++;
			}
		}
		System.out.println("countOfOddNum="+countOfOddNum);
		// sum of odd num formula ((n/2)*(starting odd num+ending odd num))
		// n=total odd numbers
		System.out.println("Sum of odd number="+((countOfOddNum / 2) * (1 + 99)));
		// another formula (n*n)
		// n=total odd numbers
		System.out.println("Sum of odd number="+countOfOddNum*countOfOddNum);
		//another method of square
		System.out.println("Sum of odd number="+Math.pow(countOfOddNum, 2));*/
		
		
		
		/*//q5
		int countEvenNum=0;
		
		for (int i = 1; i <=100; i++) {
			if (i%2==0) {
				countEvenNum++;	
			}
			
		}
		 System.out.println("Even number count="+countEvenNum);*/
		 
		 
		
		/*// q6
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number=");
		int factorialNum = input.nextInt();

		int count = 1;
		for (int i = 1; i <= factorialNum; i++) {
			count = count * i;

		}
		System.out.println("Factorial of given number"+count);*/
		
		/*// q7
		int num1 = 0;
		int num2 = 1;
		
		int num3;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number=");
		int fib = input.nextInt();
		System.out.print(num1 + "," + num2);

		for (int i = 1; i <= fib; i++) {
			num3 = num1 + num2;
			System.out.print(","+num3);
			num1 = num2;
			num2 = num3;

		}*/
		
		
		/*// q8
        boolean num = false;
        
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number =");
		int primeRNot = input.nextInt();

		if (primeRNot == 0||primeRNot == 1) {
			System.out.println("The given number is not prime number");
            return;
		}

		for (int i = 2; i <= primeRNot / 2; i++) {
			if (primeRNot % i == 0) {
				num = true;
				break;
			}
		}
		if (num == false) {
			System.out.println("The given number is  prime number");
		} else {
			System.out.println("The given number is not prime number");
		}*/
		
		
		/*//q9//9.1
		int num;
		for (int j = 1; j <= 7; j++) {
			//num = 1;
			for (int i = 1; i <= j; i++) {
				System.out.print(i+ " ");
				//num++;

			}
			System.out.println();
		}
		
        //9.2
		for (int i = 1; i <= 5; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print(" ");

			}
			for (int j = 0; j < i; j++) {
				System.out.print("*" + " ");
			}

			System.out.println(" ");
		}
		
		//9.3
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*"+" ");

			}
			System.out.println("");
		}*/
				
		
		/*//diamond pattern
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 6; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}
		for (int i = 1; i <= 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");

			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*" + " ");
			}

			System.out.println(" ");
		}*/
		
		/*//q10
		//one method
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number =");
		String num = input.next();

		int num2 = 0;

		for (int i = 0; i < num.length(); i++) {
			char num1[] = num.toCharArray();
			int numericValue = Character.getNumericValue(num1[i]);

			System.out.println(numericValue);

			double a = Math.pow(numericValue, 3);

			num2 += a;

		}
		System.out.println(num2);
		if (8==8.0) {
			System.out.println(".");
			
		}
		//another method
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter any number =");
		int arms = input1.nextInt();
		double sum = 0;
		int mod = 0;
		for (int i = 0; arms != 0; i++) {
			mod = arms % 10;
			arms = arms / 10;
			System.out.println(mod);
			sum += Math.pow(mod, 3);

		}

		System.out.println((int)sum);*/
		
		/*//q11
		//one method
		String a="123";
		int length = a.length();
		//char b[] = a.toCharArray();
		for (int j = length-1; j >=0; j--) {
			
			System.out.print(a.charAt(j));
			
		}
		//another method
        String b="123";	
		StringBuffer c=new StringBuffer(b);
		StringBuffer reverse = c.reverse();
		System.out.println(" ");
		System.out.println(c);*/
		
		
		/*//q12
		int count=0;
		for (int i = 1; i <=3; i++) {
			count++;
			
		}
		System.out.println(count);*/
		
		/*//q13
		count=0;
		for (int i = 1; i<= 3; i++) {
			count+=i;
			
		}
		System.out.println(count);*/
		
		/*//q14
		Scanner input = new Scanner(System.in);
		System.out.print("enter word or number =");
		String nextLine = input.nextLine();
		String ans="";
		 for (int i = nextLine.length()-1; i >=0; i--) {
			 ans+= nextLine.charAt(i);
			// System.out.print(ans);
			
		}
		 //if u use operators(==) it will consider both value and mermory address.
		 //string methods only validate string value.
		 if (nextLine.equalsIgnoreCase(ans)) {
				System.out.println(ans +" is a Palindrome");
			}else {
				System.out.println(ans +" is Not Palindrome");
			}*/
			

		
		
	
		
	
	
	
	}

	
}
