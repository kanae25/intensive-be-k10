public class SumCalc {
    public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5, 6};

    int sum = sumAll(A);
    System.out.println("Sum: " + sum);

    }

    // O(n) time complexity
    // A length (n) = 5
    // O(5)
    public static int sumAll(int[] A) {
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }

     // O(n/2)
    public static int sumAll_B(int[] A) {
        int sum = 0;
        int first = 0;
        int second = A.length - 1;

        while (first <= second) {
            if (first == second) {
                sum +=A[first];
            } else {
                sum += A[first] + A[second];
            }

            first++;
            second--;
        }
        
        return sum;
    }

}
