package exercises;

import java.util.Scanner;

public class Exercise06 {

    private static double calculateAverage(double[] grades) {
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i] / grades.length;
        }

        return sum;
    }

    private static boolean isApproved(double average) {
        return average >= 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] grades = new double[4];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();

            if (grades[i] < 0 || grades[i] > 10) {
                System.out.println();
                System.out.println("Invalid grade.");
                scanner.close();
                return;
            }
        }

        double average = calculateAverage(grades);
        boolean approved = isApproved(average);
        String status = approved ? "Approved" : "Failed";

        System.out.println();
        System.out.printf("Final average: %.1f\n", average);
        System.out.println("Status: " + status);

        scanner.close();
    }
}