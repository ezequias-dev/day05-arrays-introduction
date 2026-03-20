package day04.review;

import java.util.Scanner;

public class Day04Review {

    private static double calculateAverage(double firstGrade, double secondGrade) {
        return (firstGrade + secondGrade) / 2.0;
    }

    private static boolean isApproved(double average) {
        return average >= 7;
    }

    private static void showStudentResult(String name, double average, String status) {
        System.out.println("Name: " + name);
        System.out.printf("Average: %.1f", average);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Grade 1: ");
        double firstGrade = scanner.nextDouble();

        if (firstGrade < 0 || firstGrade > 10) {
            System.out.println("Invalid grade.");
            scanner.close();
            return;
        }

        System.out.print("Grade 2: ");
        double secondGrade = scanner.nextDouble();

        if (secondGrade < 0 || secondGrade > 10) {
            System.out.println("Invalid grade.");
            scanner.close();
            return;
        }

        double average = calculateAverage(firstGrade, secondGrade);
        boolean approved = isApproved(average);
        String status = approved ? "Approved" : "Failed";

        System.out.println();
        showStudentResult(name, average, status);

        scanner.close();
    }
}