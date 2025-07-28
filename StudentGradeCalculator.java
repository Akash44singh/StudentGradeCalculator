import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input: marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            int mark = sc.nextInt();

            // Validate input
            if (mark < 0 || mark > 100) {
                System.out.println(" Invalid input! Marks should be between 0 and 100.");
                i--; // Ask again
            } else {
                marks[i] = mark;
                totalMarks += mark;
            }
        }

        // Calculate average percentage
        double average = (double) totalMarks / numSubjects;

        // Grade calculation
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\n--- Student Grade Report ---");
        System.out.println("Total Marks: " + totalMarks + "/" + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
