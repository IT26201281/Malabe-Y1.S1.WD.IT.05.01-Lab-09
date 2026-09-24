import java.util.Scanner;

public class IT26201281Lab9Q4 {

    // a) calcFinalMark() - 30% assignment + 70% exam
    public static double calcFinalMark(double assignmentMark, double examMark) {
        double finalMark = assignmentMark * 0.30 + examMark * 0.70;
        return finalMark;
    }

    // b) findGrades() - return grade
    public static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // c) printDetails() - print Name, Final Mark and Grade
    public static void printDetails(String name, double finalMark, String grade) {
        // \t is for tab space, like table
        System.out.printf("%-10s %10.2f %10s\n", name, finalMark, grade);
    }

    // d) Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // For 5 students
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Student " + (i+1) + ":");
            System.out.print("Enter Name: ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double exam = input.nextDouble();
            input.nextLine(); // consume enter key

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        // Display output
        System.out.println("\n-----------------------------------------");
        System.out.printf("%-10s %10s %10s\n", "Name", "Final Mark", "Grade");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}
