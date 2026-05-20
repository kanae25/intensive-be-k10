public class Exercise {
    public static void main(String[] args) {
        
        // int arrayNum[] = {1, 2, 3, 4, 5, 6};
        int arrayNum[] = {10, 8, 7, 9, 11, 12};

        int max = arrayNum[0];
        int min = arrayNum[0];
        int sum = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] > max) {
                max = arrayNum[i];
            }
            if (arrayNum[i] < min) {
                min = arrayNum[i];
            }

            sum += arrayNum[i];
        }

        double average = (double) sum / arrayNum.length;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}