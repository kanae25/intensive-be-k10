import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

    public int solution(int[] A) {
        int n = A.length;
        int[] steps = new int[n + 2];

        for (int i = 0; i < steps.length; i++) {
            steps[i] = -1;
        }

        ArrayList<Integer> fib = new ArrayList<Integer>();
        for (int a = 1, b = 1; a <= n + 1; a = b, b = a + b) {
            fib.add(a);
        }

        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(-1);
        steps[0] = 0;

        while (!queue.isEmpty()) {
            int pos = queue.removeFirst();

            if (pos == n) {
                return steps[n + 1];
            }

            for (int jump : fib) {
                int next = pos + jump;

                if (next > n || steps[next + 1] != -1) {
                    continue;
                }

                if (next < n && A[next] == 0) {
                    continue;
                }

                steps[next + 1] = steps[pos + 1] + 1;
                queue.add(next);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        System.out.println(sol.solution(A));
    }
}
