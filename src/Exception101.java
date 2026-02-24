import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean is_loop = true;

        while (is_loop) {
            try {
                System.out.print("Enter an Integer: ");
                number = scanner.nextInt();
                is_loop = false;
            } catch (InputMismatchException err) {
                scanner.next();
                System.out.println("Invalid data type");
            } catch (ArithmeticException err){
                scanner.next();
                System.out.println("Cannot calculated");
            }
        }
            System.out.println("You inputted number = " + number);
        }
    }
