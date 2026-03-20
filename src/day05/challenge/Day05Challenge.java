package day05.challenge;

import java.util.Scanner;

public class Day05Challenge {

    private static double calculateSum(double[] grades) {
        double sum = 0.0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        return sum;
    }

    private static double calculateAverage(double sum, int gradesCount) {
        return sum / gradesCount;
    }

    private static boolean isApproved(double average) {
        return average >= 7;
    }

    private static void showStudentReport(String name, int gradesCount, double average, String status) {
        System.out.println();
        System.out.println("Student name: " + name);
        System.out.println("Grades quantity: " + gradesCount);
        System.out.printf("Average: %.1f%n", average);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("How many grades will be reported? ");
        int gradesCount = scanner.nextInt();

        if (gradesCount < 1) {
            System.out.println("Invalid number of grades.");
            scanner.close();
            return;
        }

        double[] grades = new double[gradesCount];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();

            if (grades[i] < 0 || grades[i] > 10) {
                System.out.println("Invalid grade.");
                scanner.close();
                return;
            }
        }

        double sum = calculateSum(grades);
        double average = calculateAverage(sum, gradesCount);
        boolean approved = isApproved(average);
        String status = approved ? "Approved" : "Failed";

        showStudentReport(name, gradesCount, average, status);

        scanner.close();
    }
}