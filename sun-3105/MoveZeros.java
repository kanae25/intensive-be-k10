import java.util.Arrays;

public class MoveZeros {

    public static int[] moveZeros(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 0, 3, 4, 5};
        int[] output = moveZeros(input);
        System.out.println(Arrays.toString(output)); // [1, 3, 4, 5, 0, 0]
    }
}
