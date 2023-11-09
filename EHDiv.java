package task11;

import java.util.Scanner;

public class EHDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two integers");
		Scanner sc = new Scanner(System.in);
	    int a =sc.nextInt();
		int b =sc.nextInt();
		try {
            System.out.println(a / b); // throw Exception
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println(
                "Divided by zero operation cannot possible");
        }
	}

}
