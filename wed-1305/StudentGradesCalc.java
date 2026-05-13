import java.util.Scanner;

public class StudentGradesCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Math grade: ");
        double mathGrade = input.nextDouble();

        System.out.print("Enter English grade: ");
        double englishGrade = input.nextDouble();

        System.out.print("Enter Literature grade: ");
        double literatureGrade = input.nextDouble();

        double averageGrade = (mathGrade + englishGrade + literatureGrade) / 3;
        String letterGrade;

        System.out.println("");
        System.out.println("Math Grade: " + mathGrade);
        System.out.println("English Grade: " + englishGrade);
        System.out.println("Literature Grade: " + literatureGrade);
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("");

        input.close();
    }
}