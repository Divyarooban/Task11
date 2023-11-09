package task11;

import java.util.Scanner;


	class InvalidPasswordException extends Exception {
	    public InvalidPasswordException(String message) {
	        super(message);
	    }
	}

	public class Passwordvalidate {
	    public static void main(String[] args) {
	        try {
	            String inputPassword = "password123"; // Replace with the actual password entered by the user

	            // Validate the password
	            validatePassword(inputPassword);

	            System.out.println("Password is valid.");
	        } catch (InvalidPasswordException e) {
	            System.out.println("Invalid Password: " + e.getMessage());
	        }
	    }

	    public static void validatePassword(String password) throws InvalidPasswordException {
	        // You can implement your password validation logic here.
	        // For example, check if the password has a minimum length or contains specific characters.

	        if (password.length() < 8) {
	            throw new InvalidPasswordException("Password is too short. It should be at least 8 characters long.");
	        }

	        // Add more validation rules as needed

	        // If the password passes all validation checks, you can consider it valid.
	    }
	}

}
