import java.util.Scanner;

public class Ex1 {
    // Write a program in Java to calculate the average of three numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter the third number: ");
        double num3 = input.nextDouble();

        double avarage = ((num1 + num2 + num3) / 3);

        System.out.println("The avarage of the numbers is: " + avarage);

    }
}
