public class Palindrome {
    public static boolean isPalindrome(int[] number) {
        int left = 0;
        int right = number.length - 1;

        while (left < right) {
            if (number[left] != number[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 2, 1};
        int[] test2 = {1, 2, 3, 4, 5};
        int[] test3 = {3, 5, 5, 5, 3};
        int[] test4 = {3, 6, 7, 7, 3};
        int[] test5 = {1, 2, 4, 3, 1};

        System.out.println( "test1: " + isPalindrome(test1));
        System.out.println( "test2: " + isPalindrome(test2));
        System.out.println( "test3: " + isPalindrome(test3));
        System.out.println( "test4: " + isPalindrome(test4));
        System.out.println( "test5: " + isPalindrome(test5));
    }
}