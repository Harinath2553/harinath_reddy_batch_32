public class AverageSquare {
    public static double AverageSquares(int[] numbers) {
        int sum = 0;
        int count = 0;

        for (int num : numbers) {
            if (num % 2 != 0) { // Check if the number is odd
                sum += num * num;
                count++;
            }
        }

        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,4,3,4,2,0};
        double average = AverageSquares(numbers);
        System.out.println("Average of squares of odd numbers: " + average);
    }
}
