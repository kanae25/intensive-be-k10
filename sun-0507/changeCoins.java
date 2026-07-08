public class changeCoins {

    public int changeCoins(int money) {
        if (money <= 0) {
            return 0;
        }

        int[] coins = {20, 10, 5, 1};
        int count = 0;

        for (int i = 0; i < coins.length; i++) {
            count = count + money / coins[i];
            money = money % coins[i];
        }

        return count;
    }

    public static void main(String[] args) {
        changeCoins sol = new changeCoins();
        System.out.println(sol.changeCoins(47));
        System.out.println(sol.changeCoins(20));
        System.out.println(sol.changeCoins(3));
        System.out.println(sol.changeCoins(0));
        System.out.println(sol.changeCoins(-10));
    }
}
