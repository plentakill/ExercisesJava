import java.util.Scanner;

public class Ex6 {
    //Write a program in Java that asks for 10 integers, which can be below zero, and prints :
    //The sum of the positive integers
    //The average of the negative integers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumPositive = 0;
        int countPositive = 0;
        int sumNegative = 0;
        int countNegative = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int num = scanner.nextInt();
            if (num >= 0) {
                sumPositive += num;
                countPositive++;
            } else {
                sumNegative += num;
                countNegative++;
            }
        }

        if (countPositive > 0) {
            System.out.println("The sum of the positive integers is " + sumPositive);
        } else {
            System.out.println("There were no positive integers entered");
        }

        if (countNegative > 0) {
            double avgNegative = (double) sumNegative / countNegative;
            System.out.println("The average of the negative integers is " + avgNegative);
        } else {
            System.out.println("There were no negative integers entered");
        }
    }
}
