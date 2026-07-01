public class Solution {

    public int solution(String S, int K) {
        String[] words = S.split(" ");
        int messages = 1;
        int currentLength = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() > K) {
                return -1;
            }

            if (currentLength == 0) {
                currentLength = word.length();
            } else {
                int neededLength = currentLength + 1 + word.length();

                if (neededLength <= K) {
                    currentLength = neededLength;
                } else {
                    messages++;
                    currentLength = word.length();
                }
            }
        }

        return messages;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String text = "SMS messages are really short";
        int k = 12;

        int result = sol.solution(text, k);
        System.out.println(result);
    }
}
