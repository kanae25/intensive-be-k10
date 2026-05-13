import java.util.Scanner;

public class StudentGradesCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");

        System.out.print("Enter Math grade: ");
        double math = input.nextDouble();

        System.out.print("Enter English grade: ");
        double english = input.nextDouble();

        System.out.print("Enter Literature grade: ");
        double literature = input.nextDouble();

        // calc average score / create letter grade
        double averageScore = Math.round((math + english + literature) / 3 * 100.0) / 100.0;
        String avgLetterGrade;

        // check failed subject / students
        if (math < 5 || english < 5 || literature < 5) {
            System.out.println("");
            System.out.println("Math Grade: " + math);
            System.out.println("English Grade: " + english);
            System.out.println("Literature Grade: " + literature);
            System.out.println("Average Score: " + averageScore);
            System.out.println("Average Letter Grade: F");
            System.out.println("Failed Student.");
            System.out.println("");
        }

        if (averageScore < 5) {
            avgLetterGrade = "F";
        } else if (averageScore >= 5 && averageScore < 6) {
            avgLetterGrade = "D";
        } else if (averageScore >= 6 && averageScore < 7) {
            avgLetterGrade = "C";
        } else if (averageScore >= 7 && averageScore < 8) {
            avgLetterGrade = "B";
        } else if (averageScore >= 8 && averageScore    < 9) {
            avgLetterGrade = "A";
        }
        else {
            avgLetterGrade = "S";
        }

        

        input.close();
    }
}