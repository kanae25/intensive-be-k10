import java.util.Arrays;

public class Homework2 {
    public int solution(int[] A) {
        if (A.length < 3 || A.length == 0) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            long a = A[i];
            long b = A[i + 1];
            long c = A[i + 2];

            if (a + b > c) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Homework2 hw = new Homework2();
        int[] A = {10, 2, 5, 1, 8, 20};
        System.out.println(hw.solution(A));
    }
}
