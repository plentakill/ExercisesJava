import java.util.Scanner;

public class Ex5 {
    // Write a Java program that uses a for loop to print the first n even numbers.
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
