import java.util.Scanner;

public class Ex4 {
    // Write a Java program that uses a for loop to calculate the sum of
    // the first n natural numbers (positive integers).
    // The value of n should be entered by the user.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }
    }
}
