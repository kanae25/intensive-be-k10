public class PrimeCheck {
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int test0 = 1;
        int test1 = 2;
        int test2 = 3;
        int test3 = 4;
        int test4 = 5;
        int test5 = 6;
        int test6 = 7;
        int test7 = 8;
        int test8 = 9;
        int test9 = 10;
        int test10 = 11;

        System.out.println( "test0: " + isPrimeNumber(test0));
        System.out.println( "test1: " + isPrimeNumber(test1));
        System.out.println( "test2: " + isPrimeNumber(test2));
        System.out.println( "test3: " + isPrimeNumber(test3));
        System.out.println( "test4: " + isPrimeNumber(test4));
        System.out.println( "test5: " + isPrimeNumber(test5));
        System.out.println( "test6: " + isPrimeNumber(test6));
        System.out.println( "test7: " + isPrimeNumber(test7));
        System.out.println( "test8: " + isPrimeNumber(test8));
        System.out.println( "test9: " + isPrimeNumber(test9));
        System.out.println( "test10: " + isPrimeNumber(test10));
    }
}