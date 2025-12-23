import java.util.Random;
import java.util.Scanner;

public class Lab603 {
    public static int[] random_array() {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        return numbers;
    }

    public static void display_array(int[] numbers) {
        System.out.print("Here are the elements in the array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static int count_element(int[] numbers, int element) {
        int count = 0;
        for (int value : numbers) {
            if (value == element) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = random_array();

        System.out.print("Enter your guess (0-20): ");
        int guess;
        if (scanner.hasNextInt()) {
            guess = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please run the program again and enter an integer (0-99).");
            scanner.close();
            return;
        }

        if (guess < 0 || guess > 21) {
            System.out.println("Invalid range. Please run the program again " +
                    "and enter a number between 0 and 99.");
            scanner.close();
            return;
        }

        int count = count_element(numbers, guess);

        if (count >= 1) {
            System.out.println("Congratulations! " + guess + " is an element in the array!");
            if (count > 1) {
                System.out.println("Fantastic! It also appears more than once!!");
            }
        } else {
            System.out.println("Sorry, try again next time...");
            display_array(numbers);
        }

        scanner.close();
    }
}

