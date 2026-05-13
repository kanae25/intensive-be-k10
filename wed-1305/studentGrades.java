import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Math grade: ");
        double mathGrade = scanner.nextDouble();

        System.out.print("Enter English grade: ");
        double englishGrade = scanner.nextDouble();

        System.out.print("Enter Literature grade: ");
        double literatureGrade = scanner.nextDouble();
    }
}