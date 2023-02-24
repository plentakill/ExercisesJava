import java.util.Scanner;

public class Ex4 {
    // Write a Java program that uses a for loop to
    // calculate the sum of the first n natural numbers (positive integers).
    // The value of n should be entered by the user.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is " + sum);
    }
}