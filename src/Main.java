import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        String[] names = {"Ana", "Carlos", "Julia", "Pedro"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
        }

        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[3];

        System.out.println();

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        System.out.println();

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Stored grade: " + grades[i]);
        }

        scanner.close();
    }
}