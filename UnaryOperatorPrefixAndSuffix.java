package com.aomruk.helloWorld;

public class UnaryOperatorPrefixAndSuffix {
	public static void main(String[] args) {
		int i = 20;
//1a. suffix unary operator
		System.out.println("1a. suffix unary operator");
		for (int n=1; n<6; n++) {
				i++;
				System.out.println(i);
		}
//1b. prefix unary operator
		System.out.println("1b. prefix unary operator");
		for (int n=1; n<6; n++) {
				--i;
				System.out.println(i);
		}
//2. Conditional operator &&					
		float floatNo1 = 1.1f;
		float floatNo2 = 2.2f;
		if((floatNo1 == 1.1)&&(floatNo2 = 2.2))//The operator && is undefined for float and boolean
			System.out.print("float number 1 is 1.1 AND float number 2 is 2.2");
	
//3. Conditional operator ||					
		char charNo1 = 'A';
		char charNo2 = 'B';
		if((charNo1 == 'A')||(charNo2 = 'B'))//The operator || is undefined for char and boolean
			System.out.print("char number1 is A OR char number 2 is B");
	}
}

