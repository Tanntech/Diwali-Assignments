import java.util.Scanner;

public class LongestStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // to consume leftover newline

        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int len = 0;

            // manually count characters (instead of using arr[i].length())
            for (int j = 0; j < arr[i].toCharArray().length; j++) {
                len++;
            }

            if (len > maxLength)
                maxLength = len;
        }

        System.out.println("Length of the longest string = " + maxLength);
    }
}
