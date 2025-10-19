import java.util.Scanner;

public class PrimeCheckSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        if (n <= 1)
            System.out.println("False");
        else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;
            }
            if (count == 2)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
