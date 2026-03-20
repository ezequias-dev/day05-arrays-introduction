package exercises;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }

        System.out.println();
        System.out.println("Greatest value: " + max);

        scanner.close();
    }
}