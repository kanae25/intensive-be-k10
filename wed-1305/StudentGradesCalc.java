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

        

        input.close();
    }
}