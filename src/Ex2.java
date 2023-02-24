import java.util.Scanner;

public class Ex2 {
    // Write a program in Java to check if a given number is even or odd.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Is an even number");
        } else {
            System.out.println("Is an odd number");
        }

    }
}

