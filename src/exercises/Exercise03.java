package exercises;

import java.util.Scanner;

public class Exercise03 {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int[] numbers = new int[5];

         for (int i = 0; i < numbers.length; i++) {
             System.out.print("Enter number " + (i + 1) + ": ");
             numbers[i] = scanner.nextInt();
         }

         System.out.println();

         for (int i = 0; i < numbers.length; i++) {
             System.out.println("Number " + (i + 1) + ": " + numbers[i]);
         }

         scanner.close();
     }
}