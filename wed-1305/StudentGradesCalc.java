import java.util.Scanner;

public class StudentGradesCalc {
    // Grade levels make comparisons easier: F = 0, D = 1, C = 2, B = 3, A = 4, S = 5.
    private static int getGradeLevel(double point) {
        if (point < 5) {
            return 0;
        } else if (point < 6) {
            return 1;
        } else if (point < 7) {
            return 2;
        } else if (point < 8) {
            return 3;
        } else if (point < 9) {
            return 4;
        } else {
            return 5;
        }
    }

    private static String getGrade(int gradeLevel) {
        if (gradeLevel == 0) {
            return "F";
        } else if (gradeLevel == 1) {
            return "D";
        } else if (gradeLevel == 2) {
            return "C";
        } else if (gradeLevel == 3) {
            return "B";
        } else if (gradeLevel == 4) {
            return "A";
        } else {
            return "S";
        }
    }

    private static String getMessage(int gradeLevel) {
        if (gradeLevel == 5) {
            return "excellent student";
        } else if (gradeLevel == 4) {
            return "good student";
        } else if (gradeLevel == 3) {
            return "normal student";
        } else if (gradeLevel == 2) {
            return "average student";
        } else if (gradeLevel == 1) {
            return "not bad student";
        } else {
            return "fail student";
        }
    }

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
        int mathGradeLevel = getGradeLevel(math);
        int englishGradeLevel = getGradeLevel(english);
        int literatureGradeLevel = getGradeLevel(literature);
        int averageGradeLevel = getGradeLevel(averageScore);

        // check failed subject / students
        if (mathGradeLevel == 0 || englishGradeLevel == 0 || literatureGradeLevel == 0) {
            averageGradeLevel = 0;
        } else {
            int lowestGradeLevel = Math.min(mathGradeLevel, Math.min(englishGradeLevel, literatureGradeLevel));
            int highestAllowedGradeLevel = lowestGradeLevel + 1;

            if (averageGradeLevel > highestAllowedGradeLevel) {
                averageGradeLevel = highestAllowedGradeLevel;
            }
        }

        System.out.println("");
        System.out.println("Math Grade: " + getGrade(mathGradeLevel));
        System.out.println("English Grade: " + getGrade(englishGradeLevel));
        System.out.println("Literature Grade: " + getGrade(literatureGradeLevel));
        System.out.println("Average Score: " + averageScore);
        System.out.println("Average Letter Grade: " + getGrade(averageGradeLevel));
        System.out.println(getMessage(averageGradeLevel));
        System.out.println("");

        input.close();
    }
}