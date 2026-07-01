import java.util.Arrays;

public class RemoveDuplicate {

    public static int[] removeDuplicate(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        int[] temp = new int[arr.length];
        int index = 0;
        temp[index] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                index++;
                temp[index] = arr[i];
            }
        }

        return Arrays.copyOf(temp, index + 1);
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 2};
        int[] output = removeDuplicate(input);
        System.out.println(Arrays.toString(output)); // [1, 2]
    }
}
