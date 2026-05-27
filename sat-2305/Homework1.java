public class Homework1 {
    public int solution(int[] A) {
        int n = A.length;
        boolean[] inWholeArray = new boolean[n];
        int howManyDistinct = 0;

        for (int i = 0; i < n; i++) {
            if (!inWholeArray[A[i]]) {
                inWholeArray[A[i]] = true;
                howManyDistinct++;
            }
        }

        boolean[] inPrefix = new boolean[n];
        int foundInPrefix = 0;

        for (int i = 0; i < n; i++) {
            if (!inPrefix[A[i]]) {
                inPrefix[A[i]] = true;
                foundInPrefix++;
            }
            if (foundInPrefix == howManyDistinct) {
                return i;
            }
        }
        return n - 1;
    }

    public static void main(String[] args) {
        Homework1 hw = new Homework1();
        int[] A = {2, 2, 1, 0, 1};
        System.out.println(hw.solution(A));
    }
}
