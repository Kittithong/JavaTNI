import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number to input: ");

        int n = scanner.nextInt();

        Integer max = null;
        Integer min = null;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");


            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print("Enter number " + i + ": ");
                scanner.next();
            }

            int value = scanner.nextInt();

            if (max == null || value > max) max = value;
            if (min == null || value < min) min = value;

            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        scanner.close();

        System.out.println();
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);
    }
}