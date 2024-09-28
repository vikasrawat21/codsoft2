import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSub;
        double totalMarks = 0;
        double avgpercentage;
        String gradeofstudent;

        System.out.print("Enter the number of subjects: ");
        numSub = scanner.nextInt();

        double[] marks = new double[numSub];

        for (int i = 0; i < numSub; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        avgpercentage = (totalMarks / numSub);

        if (avgpercentage >= 90) {
            gradeofstudent = "A";
        } else if (avgpercentage >= 80) {
            gradeofstudent = "B";
        } else if (avgpercentage >= 70) {
            gradeofstudent = "C";
        } else if (avgpercentage >= 60) {
            gradeofstudent = "D";
        } else {
            gradeofstudent = "F";
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgpercentage + "%");
        System.out.println("Grade: " + gradeofstudent);
    }
}