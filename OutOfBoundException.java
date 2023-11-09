package task11;

import java.util.Scanner;

public class OutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Helloworld1";
		char[] c=str.toCharArray(); 
		//String e="";
		try {
			
			//System.out.println(str.charAt(24));//for Stringindexoutofboundexception
		for(int i=0;i<=c.length;i++) {//for Arrayindexoutofboundexception
				System.out.println(c[i]);
			}
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//The code uses a try-catch block to catch the exception.
			//If an exception occurs, the program jumps to the catch block where the exception is handled. In this case, 
			//we simply print a message indicating that the array index is out of bounds 
			System.out.println("Array index is out of bounds");
			
		}
		catch(StringIndexOutOfBoundsException e) {
			//The code uses a try-catch block to catch the exception.
			//If an exception occurs, the program jumps to the catch block where the exception is handled. In this case, 
			//we simply print a message indicating that the array index is out of bounds 
			System.out.println("String index is out of bounds");
			
		}
		
	}

}
