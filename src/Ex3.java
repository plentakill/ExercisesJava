import java.util.Scanner;

public class Ex3 {
    // Write a program in Java that prompts the user to enter their first and last name,
    // and outputs their initials in uppercase along with the number of characters in their full name.
    // The output should be formatted as follows:
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstname = input.nextLine().trim();
        System.out.println("Enter your last name: ");
        String lastname = input.nextLine().trim();

        char firstInitial = firstname.charAt(0);
        char lastInitial = lastname.charAt(0);
        String initials = (""+ firstInitial + lastInitial).toUpperCase();

        int fullNameLength = firstname.length() + lastname.length();
        System.out.println("Your initials are "+initials +" and your full name has "+fullNameLength + " characters");
    }
}
