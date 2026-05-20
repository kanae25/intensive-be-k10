public class FindSingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;

        // dùng xor cho từng số trong array
        for (int i = 0; i < nums.length; i++) {
            single ^= nums[i];
        }
        return single;
    }

    public static void main(String[] args) {

        FindSingleNumber findSingleNumber = new FindSingleNumber();

        int[] test1 = {2, 2, 1};
        int[] test2 = {4, 1, 2, 1, 2};
        int[] test3 = {1, 2, 3, 3, 2, 1, 4, 5, 4, 5, 6};
        int[] test4 = {5, 6, 7, 7, 5, 6, 8, 8, 9, 9, 10};

        System.out.println( "test1: " + findSingleNumber.singleNumber(test1));
        System.out.println( "test2: " + findSingleNumber.singleNumber(test2));
        System.out.println( "test3: " + findSingleNumber.singleNumber(test3));
        System.out.println( "test4: " + findSingleNumber.singleNumber(test4));
    }
}