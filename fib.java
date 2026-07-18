public class Main {

    public static int fib(int num) {
        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return 1;
        }

        int previous = 0;
        int current = 1;

        for (int position = 2; position <= num; position++) {
            int next = previous + current;

            previous = current;
            current = next;
        }

        return current;
    }

    public static void main(String[] args) {
        int num = 6;
        int value = fib(num);

        System.out.println(value); // 8
    }
}