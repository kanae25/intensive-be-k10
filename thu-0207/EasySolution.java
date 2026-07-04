public class EasySolution {

    public int solution(int[] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (A[j] == A[i]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        EasySolution sol = new EasySolution();
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(sol.solution(A));
    }
}
