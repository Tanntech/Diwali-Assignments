import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " distinct numbers (from 0 to " + n + "):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = (n * (n + 1)) / 2;  // sum of numbers 0 to n
        int arraySum = 0;

        for (int i = 0; i < n; i++) {
            arraySum = arraySum + arr[i];
        }

        int missing = totalSum - arraySum;
        System.out.println("Missing number = " + missing);
    }
}
