import java.util.Scanner;

public class BinaryGap {
    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
        int longestGap = 0;
        int currentGap = 0;
        boolean counting = false;

        for (int i = 0; i < binary.length(); i++) {
            char current = binary.charAt(i);

            if (current == '1') {
                if (currentGap > longestGap) {
                    longestGap = currentGap;
                }

                currentGap = 0;
                counting = true;
            } else if (counting) {
                currentGap++;
            }
        }

        return longestGap;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinaryGap binaryGap = new BinaryGap();

        System.out.println("");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Largest binary gap: " + binaryGap.solution(number));
        System.out.println("");
        
        input.close();
    }
}
