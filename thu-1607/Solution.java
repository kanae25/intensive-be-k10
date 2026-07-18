public class Solution {

    public int solution(int[] A) {
        boolean[] travel = new boolean[31];
        for (int i = 0; i < A.length; i++) {
            travel[A[i]] = true;
        }

        int[] dp = new int[31];

        for (int day = 1; day <= 30; day++) {
            if (!travel[day]) {
                dp[day] = dp[day - 1];
                continue;
            }

            int cost1 = dp[day - 1] + 2;

            int cost7;
            if (day >= 7) {
                cost7 = dp[day - 7] + 7;
            } else {
                cost7 = 7;
            }

            int cost30;
            if (day >= 30) {
                cost30 = dp[day - 30] + 25;
            } else {
                cost30 = 25;
            }

            dp[day] = Math.min(cost1, Math.min(cost7, cost30));
        }

        return dp[30];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 2, 4, 5, 7, 29, 30};
        System.out.println(sol.solution(A));
    }
}
