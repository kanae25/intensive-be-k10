public class TheFeast {
    public static int theFeast(int n, int c, int m) {
        int choco = n / c;
        int wrapper = choco;

        while (wrappers >= m) {
            int freeChoco = wrapper / m;
            choco += freeChoco;

            int remainingWrapper = wrapper % m;
            wrapper = freeChoco + remainingWrapper;
        }

        return chocolates;
    }

    public static void main(String[] args) {
        System.out.println(theFeast(10, 2, 5)); // output 6
        System.out.println(theFeast(12, 4, 4)); // output 3
        System.out.println(theFeast(6, 2, 2));  // output 5
        System.out.println(theFeast(15, 3, 2)); // output 9
    }
}
